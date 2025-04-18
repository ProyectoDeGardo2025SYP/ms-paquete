package co.edu.uco.burstcar.paquete.infraestructura.entrada.peso.consulta;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.consulta.CasoDeUsoConsultarPeso;
import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;
import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paquete/peso")
public class ConsultaControladorPeso {

    private final CasoDeUsoConsultarPeso casoDeUsoConsultarPeso;

    public ConsultaControladorPeso(CasoDeUsoConsultarPeso casoDeUsoConsultarPeso) {
        this.casoDeUsoConsultarPeso = casoDeUsoConsultarPeso;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/{id}/informacion")
    public Peso consultarPaquete(@PathVariable UUID id){
        return this.casoDeUsoConsultarPeso.ejecutarConsulta(id);
    }
}
