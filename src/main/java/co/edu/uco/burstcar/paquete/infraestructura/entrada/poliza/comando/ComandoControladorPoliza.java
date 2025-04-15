package co.edu.uco.burstcar.paquete.infraestructura.entrada.poliza.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.poliza.comando.CasoDeUsoSolicitarPoliza;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.poliza.comando.dto.PolizaDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paquete/poliza")
public class ComandoControladorPoliza {

    private final CasoDeUsoSolicitarPoliza casoDeUsoSolicitarPoliza;

    public ComandoControladorPoliza(CasoDeUsoSolicitarPoliza casoDeUsoSolicitarPoliza) {
        this.casoDeUsoSolicitarPoliza = casoDeUsoSolicitarPoliza;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/nueva")
    public UUID solicitarPoliza(@RequestBody PolizaDto dto){
        return this.casoDeUsoSolicitarPoliza.ejecutarRegistro(dto);
    }
}
