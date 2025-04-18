package co.edu.uco.burstcar.paquete.dominio.servicio.paquete;

import co.edu.uco.burstcar.paquete.dominio.dto.PaqueteActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPaquete;

import java.util.UUID;

public class ServicioActualizarPaquete {
    private final RepositorioPaquete repositorioPaquete;

    public ServicioActualizarPaquete(RepositorioPaquete repositorioPaquete) {
        this.repositorioPaquete = repositorioPaquete;
    }


    public void ejecutarActualizar(PaqueteActualizacionDto dto, UUID idPaquete){
        this.repositorioPaquete.actualizarInformacionPaquete(dto, idPaquete);
    }
}
