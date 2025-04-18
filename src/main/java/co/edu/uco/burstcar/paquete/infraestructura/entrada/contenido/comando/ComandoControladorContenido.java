package co.edu.uco.burstcar.paquete.infraestructura.entrada.contenido.comando;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando.CasoDeUsoActualizarContenido;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando.CasoDeUsoRegistrarContenido;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando.dto.ContenidoDto;
import co.edu.uco.burstcar.paquete.dominio.dto.ContenidoActualizacionDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paquete/contenido")
public class ComandoControladorContenido {

    private final CasoDeUsoRegistrarContenido casoDeUsoRegistrarContenido;
    private final CasoDeUsoActualizarContenido casoDeUsoActualizarContenido;

    public ComandoControladorContenido(CasoDeUsoRegistrarContenido casoDeUsoRegistrarContenido, CasoDeUsoActualizarContenido casoDeUsoActualizarContenido) {
        this.casoDeUsoRegistrarContenido = casoDeUsoRegistrarContenido;
        this.casoDeUsoActualizarContenido = casoDeUsoActualizarContenido;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/nuevo")
    public UUID registrarContenido(@RequestBody ContenidoDto dto){
        return this.casoDeUsoRegistrarContenido.ejecutarRegistro(dto);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}/cambio")
    public void actualizarContenido(@RequestBody ContenidoActualizacionDto dto, @PathVariable UUID id){
        this.casoDeUsoActualizarContenido.ejecutarActualizar(dto, id);
    }
}
