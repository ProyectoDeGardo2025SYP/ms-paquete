package co.edu.uco.burstcar.paquete.infraestructura.entrada.paquete.consulta;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.consulta.CasoDeUsoConsultarPaquete;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.consulta.CasoDeUsoConsultarPaquetePorServicio;
import co.edu.uco.burstcar.paquete.dominio.dto.PaqueteConsultaPorServicioDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/paquete")
public class ConsultaControladorPaquete {

    private final CasoDeUsoConsultarPaquete casoDeUsoConsultarPaquete;
    private final CasoDeUsoConsultarPaquetePorServicio casoDeUsoConsultarPaquetePorServicio;

    public ConsultaControladorPaquete(CasoDeUsoConsultarPaquete casoDeUsoConsultarPaquete, CasoDeUsoConsultarPaquetePorServicio casoDeUsoConsultarPaquetePorServicio) {
        this.casoDeUsoConsultarPaquete = casoDeUsoConsultarPaquete;
        this.casoDeUsoConsultarPaquetePorServicio = casoDeUsoConsultarPaquetePorServicio;
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}/informacion")
    public Paquete consultarPaquete(@PathVariable UUID id){
        return this.casoDeUsoConsultarPaquete.ejecutarConsulta(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/servicio/{id}/informacion")
    public List<PaqueteConsultaPorServicioDto> consultarPaquetePorServicio(@PathVariable UUID id){
        return this.casoDeUsoConsultarPaquetePorServicio.ejecutarConsulta(id);
    }
}
