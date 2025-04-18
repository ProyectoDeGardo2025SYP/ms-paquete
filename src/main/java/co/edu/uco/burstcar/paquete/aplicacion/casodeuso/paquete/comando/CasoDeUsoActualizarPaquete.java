package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando;

import co.edu.uco.burstcar.paquete.dominio.dto.PaqueteActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.dto.PesoActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.servicio.paquete.ServicioActualizarPaquete;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CasoDeUsoActualizarPaquete {
    private final ServicioActualizarPaquete servicioActualizarPaquete;

    public CasoDeUsoActualizarPaquete(ServicioActualizarPaquete servicioActualizarPaquete) {
        this.servicioActualizarPaquete = servicioActualizarPaquete;
    }

    public void ejecutarActualizar(PaqueteActualizacionDto dto, UUID idPaquete) {
        this.servicioActualizarPaquete.ejecutarActualizar(dto, idPaquete);
    }
}