package co.edu.uco.burstcar.paquete.dominio.puerto;

import co.edu.uco.burstcar.paquete.dominio.dto.PaqueteActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;

import java.util.UUID;

public interface RepositorioPaquete {

    UUID registrarInformacionNuevoPaquete(Paquete paquete);
    void actualizarInformacionPaquete(PaqueteActualizacionDto dto, UUID idPaquete);
    Paquete consultarPaquete(UUID identificador);
}
