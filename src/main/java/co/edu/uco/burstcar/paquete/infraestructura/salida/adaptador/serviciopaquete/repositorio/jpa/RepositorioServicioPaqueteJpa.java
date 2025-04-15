package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.serviciopaquete.repositorio.jpa;

import java.util.UUID;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.serviciopaquete.entidad.EntidadServicioPaquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioServicioPaqueteJpa extends JpaRepository<EntidadServicioPaquete, UUID> {
}
