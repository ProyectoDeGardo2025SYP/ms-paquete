package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.comando.dto.PesoDto;
import co.edu.uco.burstcar.paquete.aplicacion.mapeador.peso.impl.MapeadorPesoAplicacion;
import co.edu.uco.burstcar.paquete.dominio.servicio.peso.ServicioRegistrarPeso;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CasoDeUsoRegistrarPeso {
    private final ServicioRegistrarPeso servicioRegistrarPeso;
    private final MapeadorPesoAplicacion mapeadorPesoAplicacion;

    public CasoDeUsoRegistrarPeso(ServicioRegistrarPeso servicioRegistrarPeso, MapeadorPesoAplicacion mapeadorPesoAplicacion) {
        this.servicioRegistrarPeso = servicioRegistrarPeso;
        this.mapeadorPesoAplicacion = mapeadorPesoAplicacion;
    }

    public UUID ejecutarRegistro(PesoDto dto) {
        return this.servicioRegistrarPeso.ejecutarRegistro(
                this.mapeadorPesoAplicacion.aDominio(dto));
    }
}