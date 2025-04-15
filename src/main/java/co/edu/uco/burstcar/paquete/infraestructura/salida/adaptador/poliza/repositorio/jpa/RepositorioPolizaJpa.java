package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.poliza.repositorio.jpa;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.poliza.entidad.EntidadPoliza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface RepositorioPolizaJpa extends JpaRepository<EntidadPoliza, UUID> {

}
