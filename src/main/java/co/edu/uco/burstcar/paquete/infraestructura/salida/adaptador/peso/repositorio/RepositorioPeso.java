package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.peso.repositorio;

import co.edu.uco.burstcar.paquete.dominio.dto.PesoActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.dto.PesoConsultaDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Contenido;
import co.edu.uco.burstcar.paquete.dominio.modelo.MedidaPaquete;
import co.edu.uco.burstcar.paquete.dominio.modelo.MonedaPaquete;
import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.entidad.EntidadContenido;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.repositorio.jpa.RepositoryContenidoJpa;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.entidad.EntidadMedidaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.repositorio.jpa.RepositorioMedidaPaqueteJpa;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.peso.entidad.EntidadPeso;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.peso.repositorio.jpa.RepositorioPesoJpa;
import java.util.UUID;
import org.springframework.stereotype.Repository;


@Repository
public class RepositorioPeso implements co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPeso {

    private final RepositorioPesoJpa repositorioPesoJpa;
    private final RepositoryContenidoJpa repositoryContenidoJpa;
    private final RepositorioMedidaPaqueteJpa repositorioMedidaPaqueteJpa;

    public RepositorioPeso(RepositorioPesoJpa repositorioPesoJpa,
                           RepositoryContenidoJpa repositoryContenidoJpa,
                           RepositorioMedidaPaqueteJpa repositorioMedidaPaqueteJpa) {
        this.repositorioPesoJpa = repositorioPesoJpa;
        this.repositoryContenidoJpa = repositoryContenidoJpa;
        this.repositorioMedidaPaqueteJpa = repositorioMedidaPaqueteJpa;
    }

    @Override
    public UUID registrarPesoContenido(Peso peso) {
        EntidadContenido entidadContenido = this.repositoryContenidoJpa.findById(peso.getContenido().getIdentificador()).orElse(null);
        EntidadMedidaPaquete entidadMedidaPaquete = this.repositorioMedidaPaqueteJpa.findByAbreviatura(peso.getMedidaPaquete().getAbreviaturaMedida());

        EntidadPeso entidadPeso = new EntidadPeso(peso.getValor(), entidadContenido, entidadMedidaPaquete);
        entidadPeso.setIdentificador(peso.getIdentificador());
        return this.repositorioPesoJpa.save(entidadPeso).getIdentificador();
    }

    @Override
    public void actualizarPesoContenido(PesoActualizacionDto dto, UUID idPeso) {
        EntidadPeso entidadPeso = this.repositorioPesoJpa.findById(idPeso).orElse(null);
        EntidadContenido entidadContenido = this.repositoryContenidoJpa.findById(dto.getIdContenido()).orElse(null);
        EntidadMedidaPaquete entidadMedidaPaquete = this.repositorioMedidaPaqueteJpa.findById(dto.getIdMedidaPaquete()).orElse(null);
        assert entidadPeso != null;
        entidadPeso.setValor(dto.getValor());
        entidadPeso.setEntidadContenido(entidadContenido);
        entidadPeso.setEntidadMedidaPaquete(entidadMedidaPaquete);
        this.repositorioPesoJpa.save(entidadPeso);
    }

    @Override
    public Peso consultarPeso(UUID identificador) {
        EntidadPeso entidadPeso = this.repositorioPesoJpa.findById(identificador).orElse(null);

        assert entidadPeso != null;
        EntidadContenido entidadContenido =
                this.repositoryContenidoJpa.findById(entidadPeso.getEntidadContenido().getIdentificador()).orElse(null);
        assert entidadContenido != null;
        MonedaPaquete monedaPaquete = MonedaPaquete.nuevaMonedaPaqueteConIdentificador(entidadContenido.getEntidadMonedaPaquete().getIdentificador(),
                entidadContenido.getEntidadMonedaPaquete().getNombreMoneda(), entidadContenido.getEntidadMonedaPaquete().getCodigoMoneda());
        Contenido contenido = Contenido.nuevoContenidoConIdentificador(entidadContenido.getIdentificador(),
                entidadContenido.getDescripcion(), entidadContenido.getFragil(), entidadContenido.getValorAproximado(), monedaPaquete);

        EntidadMedidaPaquete entidadMedidaPaquete =
                this.repositorioMedidaPaqueteJpa.findByAbreviatura(entidadPeso.getEntidadMedidaPaquete().getAbreviaturaMedida());
        MedidaPaquete medidaPaquete = MedidaPaquete.nuevaMedidaConIdentificador(entidadMedidaPaquete.getIdentificador(),
                entidadMedidaPaquete.getNombreMedida(), entidadMedidaPaquete.getAbreviaturaMedida(), entidadMedidaPaquete.getIdentificadorTipoUnidad(),
                entidadMedidaPaquete.getNombreTipoUnidadMetrica());


        return Peso.nuevoPesoConIdentificador(entidadPeso.getIdentificador(), entidadPeso.getValor(),
                contenido, medidaPaquete);
    }

    @Override
    public PesoConsultaDto consultarPesoPorContenido(UUID idContenido) {
        EntidadPeso entidadPeso = this.repositorioPesoJpa.consultarPorContendio(idContenido);

        assert entidadPeso != null;
        EntidadMedidaPaquete entidadMedidaPaquete =
                this.repositorioMedidaPaqueteJpa.findByAbreviatura(entidadPeso.getEntidadMedidaPaquete().getAbreviaturaMedida());
        MedidaPaquete medidaPaquete = MedidaPaquete.nuevaMedidaConIdentificador(entidadMedidaPaquete.getIdentificador(),
                entidadMedidaPaquete.getNombreMedida(), entidadMedidaPaquete.getAbreviaturaMedida(), entidadMedidaPaquete.getIdentificadorTipoUnidad(),
                entidadMedidaPaquete.getNombreTipoUnidadMetrica());

        return PesoConsultaDto.nuevoPesoConsultaDtoConIdentificador(entidadPeso.getIdentificador(),
                entidadPeso.getValor(), medidaPaquete);
    }

}
