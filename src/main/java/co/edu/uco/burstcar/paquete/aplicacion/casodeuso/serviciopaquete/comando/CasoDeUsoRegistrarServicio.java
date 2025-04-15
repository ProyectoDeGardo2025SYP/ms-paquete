package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.serviciopaquete.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.serviciopaquete.comando.dto.ServicioDto;
import co.edu.uco.burstcar.paquete.aplicacion.mapeador.serviciopaquete.impl.MapeadorServicioAplicacion;
import co.edu.uco.burstcar.paquete.dominio.servicio.serviciopaquete.ServicioRegistrarServicio;
import org.springframework.stereotype.Component;

@Component
public class CasoDeUsoRegistrarServicio {
    private final ServicioRegistrarServicio servicioRegistrarServicio;
    private final MapeadorServicioAplicacion mapeadorServicioAplicacion;

    public CasoDeUsoRegistrarServicio(ServicioRegistrarServicio servicioRegistrarServicio, MapeadorServicioAplicacion mapeadorServicioAplicacion) {
        this.servicioRegistrarServicio = servicioRegistrarServicio;
        this.mapeadorServicioAplicacion = mapeadorServicioAplicacion;
    }


    public void ejecutarRegistro(ServicioDto dto) {
        this.servicioRegistrarServicio.ejecutarRegistro
                (this.mapeadorServicioAplicacion.aDominio(dto));
    }
}