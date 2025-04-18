package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando;

import co.edu.uco.burstcar.paquete.dominio.dto.ContenidoActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.servicio.contenido.ServicioActualizarContenido;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CasoDeUsoActualizarContenido {
    private final ServicioActualizarContenido servicioActualizarContenido;

    public CasoDeUsoActualizarContenido(ServicioActualizarContenido servicioActualizarContenido) {
        this.servicioActualizarContenido = servicioActualizarContenido;
    }


    public void ejecutarActualizar(ContenidoActualizacionDto dto, UUID idContendio) {
        this.servicioActualizarContenido.ejecutarActualizar(dto, idContendio);
    }
}