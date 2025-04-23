package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.consulta;

import co.edu.uco.burstcar.paquete.dominio.dto.PesoConsultaDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;
import co.edu.uco.burstcar.paquete.dominio.servicio.peso.ServicioConsultarPesoPorContenido;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CasoDeUsoConsultarPesoPorContenido {
    private final ServicioConsultarPesoPorContenido servicioConsultarPesoPorContenido;

    public CasoDeUsoConsultarPesoPorContenido(ServicioConsultarPesoPorContenido servicioConsultarPesoPorContenido) {
        this.servicioConsultarPesoPorContenido = servicioConsultarPesoPorContenido;
    }

    public PesoConsultaDto ejecutarConsulta(UUID idContenido) {
        return this.servicioConsultarPesoPorContenido.ejecutarConsulta(idContenido);
    }
}