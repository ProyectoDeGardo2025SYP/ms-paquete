package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando.dto.PaqueteDto;
import co.edu.uco.burstcar.paquete.aplicacion.mapeador.servicio.impl.MapeadorPaqueteAplicacion;
import co.edu.uco.burstcar.paquete.dominio.servicio.paquete.ServicioRegistrarPaquete;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CasoDeUsoRegistrarPaquete {
    private final ServicioRegistrarPaquete servicioRegistrarPaquete;
    private final MapeadorPaqueteAplicacion mapeadorPaqueteAplicacion;

    public CasoDeUsoRegistrarPaquete(ServicioRegistrarPaquete servicioRegistrarPaquete, MapeadorPaqueteAplicacion mapeadorPaqueteAplicacion) {
        this.servicioRegistrarPaquete = servicioRegistrarPaquete;
        this.mapeadorPaqueteAplicacion = mapeadorPaqueteAplicacion;
    }

    public UUID ejecutarRegistro(PaqueteDto dto) {
        return this.servicioRegistrarPaquete.ejecutarRegistro(
                this.mapeadorPaqueteAplicacion.aDominio(dto));
    }
}