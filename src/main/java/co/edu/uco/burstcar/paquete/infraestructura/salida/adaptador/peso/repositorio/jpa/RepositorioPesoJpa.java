package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.peso.repositorio.jpa;

import java.util.UUID;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.peso.entidad.EntidadPeso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioPesoJpa extends JpaRepository<EntidadPeso, UUID> {

    @Query(value = "Select * from paquete.peso where peso.contenido_id = :idContenido", nativeQuery = true)
    EntidadPeso consultarPorContendio(@Param("idContenido") UUID idContenido);

}
