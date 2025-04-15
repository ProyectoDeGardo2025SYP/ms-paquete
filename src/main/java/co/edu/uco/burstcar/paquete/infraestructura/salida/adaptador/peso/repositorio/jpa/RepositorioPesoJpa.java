package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.peso.repositorio.jpa;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.entidad.EntidadContenido;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.entidad.EntidadMedidaPaquete;
import java.util.UUID;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.peso.entidad.EntidadPeso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioPesoJpa extends JpaRepository<EntidadPeso, UUID> {

}
