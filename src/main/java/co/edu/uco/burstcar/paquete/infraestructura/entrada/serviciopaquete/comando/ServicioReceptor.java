package co.edu.uco.burstcar.paquete.infraestructura.entrada.serviciopaquete.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.serviciopaquete.comando.CasoDeUsoRegistrarServicio;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.serviciopaquete.comando.dto.ServicioDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ServicioReceptor {

    private final CasoDeUsoRegistrarServicio casoDeUsoRegistrarServicio;

    public ServicioReceptor(CasoDeUsoRegistrarServicio casoDeUsoRegistrarServicio) {
        this.casoDeUsoRegistrarServicio = casoDeUsoRegistrarServicio;
    }


    @RabbitListener(queues = "cola.ms-servicio.registro")
    public void ejecutarRegistro(ServicioDto dto){
        this.casoDeUsoRegistrarServicio.ejecutarRegistro(dto);
    }
}
