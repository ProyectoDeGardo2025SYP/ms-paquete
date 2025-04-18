package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.consulta;

import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;
import co.edu.uco.burstcar.paquete.dominio.servicio.paquete.ServicioConsultarPaquete;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CasoDeUsoConsultarPaquete {
    private final ServicioConsultarPaquete servicioConsultarPaquete;

    public CasoDeUsoConsultarPaquete(ServicioConsultarPaquete servicioConsultarPaquete) {
        this.servicioConsultarPaquete = servicioConsultarPaquete;
    }

    public Paquete ejecutarConsulta(UUID idServicio) {
        return this.servicioConsultarPaquete.ejecutarConsulta(idServicio);
    }
}