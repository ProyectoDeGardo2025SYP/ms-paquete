package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando.dto.ContenidoDto;
import co.edu.uco.burstcar.paquete.aplicacion.mapeador.contenido.impl.MapeadorContenidoAplicacion;
import co.edu.uco.burstcar.paquete.dominio.servicio.contenido.ServicioRegistrarContenido;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CasoDeUsoRegistrarContenido {
    private final ServicioRegistrarContenido servicioRegistrarContenido;
    private final MapeadorContenidoAplicacion mapeadorContenidoAplicacion;

    public CasoDeUsoRegistrarContenido(ServicioRegistrarContenido servicioRegistrarContenido, MapeadorContenidoAplicacion mapeadorContenidoAplicacion) {
        this.servicioRegistrarContenido = servicioRegistrarContenido;
        this.mapeadorContenidoAplicacion = mapeadorContenidoAplicacion;
    }


    public UUID ejecutarRegistro(ContenidoDto dto) {
        return this.servicioRegistrarContenido.ejecutarRegistro(
                this.mapeadorContenidoAplicacion.aDominio(dto));
    }
}