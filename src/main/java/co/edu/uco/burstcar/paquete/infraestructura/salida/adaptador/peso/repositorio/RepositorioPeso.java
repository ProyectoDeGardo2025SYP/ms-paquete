package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.peso.repositorio;

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
    public void actualizarPesoContenido(Peso peso) {

    }

    @Override
    public Peso consultarPeso(UUID identificador) {
        return null; /*repositorioPesoJpa.findById(identificador)
                .map(entidadPeso -> mapToDTO(entidadPeso))
                .orElseThrow(NotFoundException::new);*/
    }

    /*private Peso mapeo(EntidadPeso entidadPeso) {


        Peso peso = new Peso(entidadPeso.getIdentificador(),
                entidadPeso.getValor(), entidadPeso.getEntidadContenido() == null ? null : entidadPeso.getEntidadContenido().getIdentificador(),
                );
        return pesoDTO;
    }*/

}
