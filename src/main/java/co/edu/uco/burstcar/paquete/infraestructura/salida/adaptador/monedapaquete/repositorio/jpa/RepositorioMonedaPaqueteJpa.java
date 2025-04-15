package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.repositorio.jpa;

import java.util.UUID;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.entidad.EntidadMedidaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.entidad.EntidadMonedaPaquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioMonedaPaqueteJpa extends JpaRepository<EntidadMonedaPaquete, UUID> {

    @Query(value = "Select * From paquete.moneda_paquete Where codigo_moneda = :nombre",
            nativeQuery = true)
    EntidadMonedaPaquete findByNombre(@Param("nombre") String nombre);
}
