package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.poliza.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.poliza.comando.dto.PolizaDto;
import co.edu.uco.burstcar.paquete.aplicacion.mapeador.poliza.impl.MapeadorPolizaAplicacion;
import co.edu.uco.burstcar.paquete.dominio.servicio.poliza.ServicioSolicitarPoliza;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CasoDeUsoSolicitarPoliza {
    private final ServicioSolicitarPoliza servicioSolicitarPoliza;
    private final MapeadorPolizaAplicacion mapeadorPolizaAplicacion;

    public CasoDeUsoSolicitarPoliza(ServicioSolicitarPoliza servicioSolicitarPoliza, MapeadorPolizaAplicacion mapeadorPolizaAplicacion) {
        this.servicioSolicitarPoliza = servicioSolicitarPoliza;
        this.mapeadorPolizaAplicacion = mapeadorPolizaAplicacion;
    }


    public UUID ejecutarRegistro(PolizaDto dto) {
        return this.servicioSolicitarPoliza.ejecutarRegistro(
                this.mapeadorPolizaAplicacion.aDominio(dto));
    }
}