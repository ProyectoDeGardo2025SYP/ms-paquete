package co.edu.uco.burstcar.paquete.infraestructura.entrada.paquete.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando.CasoDeUsoRegistrarPaquete;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando.dto.PaqueteDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paquete")
public class ComandoControladorPaquete {

    private final CasoDeUsoRegistrarPaquete casoDeUsoRegistrarPaquete;

    public ComandoControladorPaquete(CasoDeUsoRegistrarPaquete casoDeUsoRegistrarPaquete) {
        this.casoDeUsoRegistrarPaquete = casoDeUsoRegistrarPaquete;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/nuevo")
    public UUID registrarPaquete(@RequestBody PaqueteDto dto){
        return this.casoDeUsoRegistrarPaquete.ejecutarRegistro(dto);
    }
}
