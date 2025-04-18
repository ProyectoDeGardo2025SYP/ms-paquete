package co.edu.uco.burstcar.paquete.infraestructura.entrada.paquete.consulta;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando.dto.PaqueteDto;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.consulta.CasoDeUsoConsultarPaquete;
import co.edu.uco.burstcar.paquete.dominio.dto.PaqueteActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paquete")
public class ConsultaControladorPaquete {

    private final CasoDeUsoConsultarPaquete casoDeUsoConsultarPaquete;

    public ConsultaControladorPaquete(CasoDeUsoConsultarPaquete casoDeUsoConsultarPaquete) {
        this.casoDeUsoConsultarPaquete = casoDeUsoConsultarPaquete;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/{id}/informacion")
    public Paquete consultarPaquete(@PathVariable UUID id){
        return this.casoDeUsoConsultarPaquete.ejecutarConsulta(id);
    }
}
