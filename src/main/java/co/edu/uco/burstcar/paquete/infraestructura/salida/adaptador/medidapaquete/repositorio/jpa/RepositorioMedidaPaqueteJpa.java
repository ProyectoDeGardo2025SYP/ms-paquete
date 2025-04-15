package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.repositorio.jpa;

import java.util.UUID;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.entidad.EntidadMedidaPaquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioMedidaPaqueteJpa extends JpaRepository<EntidadMedidaPaquete, UUID> {

    @Query(value = "Select * From paquete.medida_paquete Where abreviatura_medida = :abreviatura",
            nativeQuery = true)
    EntidadMedidaPaquete findByAbreviatura(@Param("abreviatura") String abreviatura);

}
