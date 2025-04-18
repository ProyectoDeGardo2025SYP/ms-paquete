package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.repositorio;

import co.edu.uco.burstcar.paquete.dominio.dto.ContenidoActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Contenido;
import co.edu.uco.burstcar.paquete.dominio.modelo.MonedaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.entidad.EntidadContenido;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.repositorio.jpa.RepositoryContenidoJpa;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.entidad.EntidadMonedaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.repositorio.jpa.RepositorioMonedaPaqueteJpa;

import java.util.UUID;
import org.springframework.stereotype.Repository;


@Repository
public class RepositorioContenido implements co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioContenido {

    private final RepositoryContenidoJpa repositoryContenidoJpa;
    private final RepositorioMonedaPaqueteJpa repositorioMonedaPaqueteJpa;

    public RepositorioContenido(RepositoryContenidoJpa repositoryContenidoJpa,
                                RepositorioMonedaPaqueteJpa repositorioMonedaPaqueteJpa) {
        this.repositoryContenidoJpa = repositoryContenidoJpa;
        this.repositorioMonedaPaqueteJpa = repositorioMonedaPaqueteJpa;
    }

    @Override
    public UUID registrarInformacionContenido(Contenido contenido) {
        EntidadMonedaPaquete entidadMonedaPaquete = this.repositorioMonedaPaqueteJpa.findByNombre(contenido.getMonedaPaquete().getCodigoMoneda());

        EntidadContenido entidadContenido = new EntidadContenido(contenido.getDescripcion(), contenido.getFragil(),
                contenido.getValorAproximado(), entidadMonedaPaquete);
        entidadContenido.setIdentificador(contenido.getIdentificador());
        return this.repositoryContenidoJpa.save(entidadContenido).getIdentificador();
    }

    @Override
    public void actualizarInformacionContenido(ContenidoActualizacionDto dto, UUID idContendio) {
        EntidadContenido entidadContenido = this.repositoryContenidoJpa.findById(idContendio).orElse(null);
        EntidadMonedaPaquete entidadMonedaPaquete = this.repositorioMonedaPaqueteJpa.findByNombre(dto.getMonedaPaquete());
        if (entidadContenido != null){
            entidadContenido.setDescripcion(dto.getDescripcion());
            entidadContenido.setFragil(dto.getFragil());
            entidadContenido.setValorAproximado(dto.getValorAproximado());
            entidadContenido.setEntidadMonedaPaquete(entidadMonedaPaquete);
            this.repositoryContenidoJpa.save(entidadContenido);
        }
    }


    @Override
    public Contenido consultarContenido(UUID identificador) {
        EntidadContenido entidadContenido = this.repositoryContenidoJpa.findById(identificador).orElse(null);

        assert entidadContenido != null;
        EntidadMonedaPaquete entidadMonedaPaquete = this.repositorioMonedaPaqueteJpa.findByNombre(entidadContenido.getEntidadMonedaPaquete().getCodigoMoneda());
        MonedaPaquete monedaPaquete = MonedaPaquete.nuevaMonedaPaqueteConIdentificador(entidadMonedaPaquete.getIdentificador(),
                entidadMonedaPaquete.getNombreMoneda(), entidadMonedaPaquete.getCodigoMoneda());

        return Contenido.nuevoContenidoConIdentificador(
                entidadContenido.getIdentificador(), entidadContenido.getDescripcion(),
                entidadContenido.getFragil(), entidadContenido.getValorAproximado(), monedaPaquete);
    }
}
