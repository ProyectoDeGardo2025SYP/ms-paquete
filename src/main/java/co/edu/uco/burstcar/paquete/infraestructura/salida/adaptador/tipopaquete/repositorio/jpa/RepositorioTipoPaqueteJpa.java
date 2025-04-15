package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.tipopaquete.repositorio.jpa;

import java.util.UUID;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.tipopaquete.entidad.EntidadTipoPaquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioTipoPaqueteJpa extends JpaRepository<EntidadTipoPaquete, UUID> {

    EntidadTipoPaquete findByNombre(String nombre);
}
