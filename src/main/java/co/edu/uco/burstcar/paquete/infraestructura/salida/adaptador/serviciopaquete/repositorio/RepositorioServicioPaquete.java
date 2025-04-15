package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.serviciopaquete.repositorio;

import co.edu.uco.burstcar.paquete.dominio.modelo.ServicioPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.serviciopaquete.entidad.EntidadServicioPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.serviciopaquete.repositorio.jpa.RepositorioServicioPaqueteJpa;
import java.util.UUID;
import org.springframework.stereotype.Repository;


@Repository
public class RepositorioServicioPaquete implements co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioServicioPaquete {

    private final RepositorioServicioPaqueteJpa repositorioServicioPaqueteJpa;

    public RepositorioServicioPaquete(RepositorioServicioPaqueteJpa repositorioServicioPaqueteJpa) {
        this.repositorioServicioPaqueteJpa = repositorioServicioPaqueteJpa;
    }

    @Override
    public ServicioPaquete asociarServicioPaquete(UUID id) {
        EntidadServicioPaquete entidadServicioPaquete = this.repositorioServicioPaqueteJpa.findById(id).orElse(null);
        if (entidadServicioPaquete == null){
            return null;
        }
        return ServicioPaquete.nuevoServicioPaqueteConIdentificador(
                entidadServicioPaquete.getIdentificador(), entidadServicioPaquete.getNombreSolicitante(),
                entidadServicioPaquete.getNumeroIdentificacion(), entidadServicioPaquete.getCodigoIdentificador(),
                entidadServicioPaquete.getTipoIdentificacion(), entidadServicioPaquete.getIdentificadorEstadoServicio(),
                entidadServicioPaquete.getNombreEstado(), entidadServicioPaquete.getUbicacionIdentificador(),
                entidadServicioPaquete.getLatitudServicio(), entidadServicioPaquete.getLongitudServicio(), entidadServicioPaquete.getDetalleAdicionalServicio(),
                entidadServicioPaquete.getIdentificadorDestino(), entidadServicioPaquete.getNombreDestinatario(),
                entidadServicioPaquete.getIdentificacionDestinatario(), entidadServicioPaquete.getCodigoMoneda(),
                entidadServicioPaquete.getCostoInicialSolicitante(), entidadServicioPaquete.getIdentificadorMoneda());
    }

    @Override
    public void registrarServicio(ServicioPaquete servicioPaquete) {
        EntidadServicioPaquete entidadServicioPaquete = new EntidadServicioPaquete(
                servicioPaquete.getNombreSolicitante(),
                servicioPaquete.getNumeroIdentificacion(), servicioPaquete.getCodigoIdentificador(),
                servicioPaquete.getTipoIdentificacion(), servicioPaquete.getIdentificadorEstadoServicio(),
                servicioPaquete.getNombreEstado(), servicioPaquete.getUbicacionIdentificador(),
                servicioPaquete.getLatitudServicio(), servicioPaquete.getLongitudServicio(), servicioPaquete.getDetalleAdicionalServicio(),
                servicioPaquete.getIdentificadorDestino(), servicioPaquete.getNombreDestinatario(),
                servicioPaquete.getIdentificacionDestinatario(), servicioPaquete.getCodigoMoneda(),
                servicioPaquete.getCostoInicialSolicitante(), servicioPaquete.getIdentificadorMoneda()
        );

        entidadServicioPaquete.setIdentificador(servicioPaquete.getIdentificador());
        this.repositorioServicioPaqueteJpa.save(entidadServicioPaquete);
    }
}
