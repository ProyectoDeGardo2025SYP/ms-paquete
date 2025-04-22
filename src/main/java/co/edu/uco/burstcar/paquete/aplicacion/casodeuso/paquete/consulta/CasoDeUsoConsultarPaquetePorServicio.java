package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.consulta;

import co.edu.uco.burstcar.paquete.dominio.dto.PaqueteConsultaPorServicioDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;
import co.edu.uco.burstcar.paquete.dominio.servicio.paquete.ServicioConsultarPaquetePorServicio;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class CasoDeUsoConsultarPaquetePorServicio {
    private final ServicioConsultarPaquetePorServicio servicioConsultarPaquetePorServicio;

    public CasoDeUsoConsultarPaquetePorServicio(ServicioConsultarPaquetePorServicio servicioConsultarPaquetePorServicio) {
        this.servicioConsultarPaquetePorServicio = servicioConsultarPaquetePorServicio;
    }

    public List<PaqueteConsultaPorServicioDto> ejecutarConsulta(UUID idServicio) {
        return this.servicioConsultarPaquetePorServicio.ejecutarConsulta(idServicio);
    }
}