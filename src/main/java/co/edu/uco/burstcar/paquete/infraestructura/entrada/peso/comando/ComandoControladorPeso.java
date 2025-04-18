package co.edu.uco.burstcar.paquete.infraestructura.entrada.peso.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.comando.CasoDeUsoActualizarPeso;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.comando.CasoDeUsoRegistrarPeso;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.comando.dto.PesoDto;
import co.edu.uco.burstcar.paquete.dominio.dto.PesoActualizacionDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paquete/peso")
public class ComandoControladorPeso {

    private final CasoDeUsoRegistrarPeso casoDeUsoRegistrarPeso;
    private final CasoDeUsoActualizarPeso casoDeUsoActualizarPeso;

    public ComandoControladorPeso(CasoDeUsoRegistrarPeso casoDeUsoRegistrarPeso, CasoDeUsoActualizarPeso casoDeUsoActualizarPeso) {
        this.casoDeUsoRegistrarPeso = casoDeUsoRegistrarPeso;
        this.casoDeUsoActualizarPeso = casoDeUsoActualizarPeso;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/nuevo")
    public UUID registrarPeso(@RequestBody PesoDto dto){
        return this.casoDeUsoRegistrarPeso.ejecutarRegistro(dto);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{idPeso}/cambio")
    public void actualizarPeso(@RequestBody PesoActualizacionDto dto, @PathVariable UUID idPeso){
        this.casoDeUsoActualizarPeso.ejecutarActualizar(dto, idPeso);
    }
}
