package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.repositorio.jpa;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.entidad.EntidadContenido;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.entidad.EntidadMedidaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.entidad.EntidadPaquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface RepositorioPaqueteJpa extends JpaRepository<EntidadPaquete, UUID> {
}
