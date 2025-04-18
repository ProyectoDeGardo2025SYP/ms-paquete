package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.comando;

import co.edu.uco.burstcar.paquete.dominio.dto.ContenidoActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.dto.PesoActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.servicio.peso.ServicioActualizarPeso;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CasoDeUsoActualizarPeso {
    private final ServicioActualizarPeso servicioActualizarPeso;

    public CasoDeUsoActualizarPeso(ServicioActualizarPeso servicioActualizarPeso) {
        this.servicioActualizarPeso = servicioActualizarPeso;
    }


    public void ejecutarActualizar(PesoActualizacionDto dto, UUID idPeso) {
        this.servicioActualizarPeso.ejecutarActualizar(dto, idPeso);
    }
}