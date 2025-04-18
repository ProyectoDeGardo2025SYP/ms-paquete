package co.edu.uco.burstcar.paquete.infraestructura.entrada.paquete.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando.CasoDeUsoActualizarPaquete;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando.CasoDeUsoRegistrarPaquete;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando.dto.PaqueteDto;
import co.edu.uco.burstcar.paquete.dominio.dto.PaqueteActualizacionDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paquete")
public class ComandoControladorPaquete {

    private final CasoDeUsoRegistrarPaquete casoDeUsoRegistrarPaquete;
    private final CasoDeUsoActualizarPaquete casoDeUsoActualizarPaquete;

    public ComandoControladorPaquete(CasoDeUsoRegistrarPaquete casoDeUsoRegistrarPaquete, CasoDeUsoActualizarPaquete casoDeUsoActualizarPaquete) {
        this.casoDeUsoRegistrarPaquete = casoDeUsoRegistrarPaquete;
        this.casoDeUsoActualizarPaquete = casoDeUsoActualizarPaquete;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/nuevo")
    public UUID registrarPaquete(@RequestBody PaqueteDto dto){
        return this.casoDeUsoRegistrarPaquete.ejecutarRegistro(dto);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{idPaquete}/cambio")
    public void actualizarPaquete(@RequestBody PaqueteActualizacionDto dto, @PathVariable UUID idPaquete){
        this.casoDeUsoActualizarPaquete.ejecutarActualizar(dto, idPaquete);
    }
}
