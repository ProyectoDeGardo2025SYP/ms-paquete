package co.edu.uco.burstcar.paquete.infraestructura.entrada.peso.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando.dto.ContenidoDto;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.comando.CasoDeUsoRegistrarPeso;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.comando.dto.PesoDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paquete/peso")
public class ComandoControladorPeso {

    private final CasoDeUsoRegistrarPeso casoDeUsoRegistrarPeso;

    public ComandoControladorPeso(CasoDeUsoRegistrarPeso casoDeUsoRegistrarPeso) {
        this.casoDeUsoRegistrarPeso = casoDeUsoRegistrarPeso;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/nuevo")
    public UUID registrarPeso(@RequestBody PesoDto dto){
        return this.casoDeUsoRegistrarPeso.ejecutarRegistro(dto);
    }
}
