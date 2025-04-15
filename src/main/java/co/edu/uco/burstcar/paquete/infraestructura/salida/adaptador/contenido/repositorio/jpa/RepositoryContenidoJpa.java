package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.repositorio.jpa;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.entidad.EntidadContenido;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.entidad.EntidadMonedaPaquete;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryContenidoJpa extends JpaRepository<EntidadContenido, UUID> {

    //EntidadContenido findFirstByMonedaPaquete(EntidadMonedaPaquete entidadMonedaPaquete);

}
