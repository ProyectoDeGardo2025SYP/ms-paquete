package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.repositorio.jpa;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.entidad.EntidadPaquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface RepositorioPaqueteJpa extends JpaRepository<EntidadPaquete, UUID> {

    @Query(value = "Select * from paquete.paquete where paquete.servicio_paquete_id = :idServcio", nativeQuery = true)
    List<EntidadPaquete> buscarPorServicio(@Param("idServcio") UUID idServcio);
}
