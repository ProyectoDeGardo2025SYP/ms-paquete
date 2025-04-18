package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.consulta;

import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;
import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;
import co.edu.uco.burstcar.paquete.dominio.servicio.peso.ServicioConsultarPeso;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CasoDeUsoConsultarPeso {
    private final ServicioConsultarPeso servicioConsultarPeso;

    public CasoDeUsoConsultarPeso(ServicioConsultarPeso servicioConsultarPeso) {
        this.servicioConsultarPeso = servicioConsultarPeso;
    }


    public Peso ejecutarConsulta(UUID idPeso) {
        return this.servicioConsultarPeso.ejecutarConsulta(idPeso);
    }
}