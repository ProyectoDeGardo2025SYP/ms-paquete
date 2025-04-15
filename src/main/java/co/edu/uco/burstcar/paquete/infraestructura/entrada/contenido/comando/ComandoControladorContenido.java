package co.edu.uco.burstcar.paquete.infraestructura.entrada.contenido.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando.CasoDeUsoRegistrarContenido;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando.dto.ContenidoDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paquete/contenido")
public class ComandoControladorContenido {

    private final CasoDeUsoRegistrarContenido casoDeUsoRegistrarContenido;

    public ComandoControladorContenido(CasoDeUsoRegistrarContenido casoDeUsoRegistrarContenido) {
        this.casoDeUsoRegistrarContenido = casoDeUsoRegistrarContenido;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/nuevo")
    public UUID registrarContenido(@RequestBody ContenidoDto dto){
        return this.casoDeUsoRegistrarContenido.ejecutarRegistro(dto);
    }
}
