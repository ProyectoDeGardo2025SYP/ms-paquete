package co.edu.uco.burstcar.paquete.infraestructura.entrada.peso.consulta;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.consulta.CasoDeUsoConsultarPeso;
import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.consulta.CasoDeUsoConsultarPesoPorContenido;
import co.edu.uco.burstcar.paquete.dominio.dto.PesoConsultaDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paquete/peso")
public class ConsultaControladorPeso {

    private final CasoDeUsoConsultarPeso casoDeUsoConsultarPeso;
    private final CasoDeUsoConsultarPesoPorContenido casoDeUsoConsultarPesoPorContenido;

    public ConsultaControladorPeso(CasoDeUsoConsultarPeso casoDeUsoConsultarPeso, CasoDeUsoConsultarPesoPorContenido casoDeUsoConsultarPesoPorContenido) {
        this.casoDeUsoConsultarPeso = casoDeUsoConsultarPeso;
        this.casoDeUsoConsultarPesoPorContenido = casoDeUsoConsultarPesoPorContenido;
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}/informacion")
    public Peso consultarPaquete(@PathVariable UUID id){
        return this.casoDeUsoConsultarPeso.ejecutarConsulta(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/contenido/{id}/informacion")
    public PesoConsultaDto consultarPaquetePorContenid(@PathVariable UUID id){
        return this.casoDeUsoConsultarPesoPorContenido.ejecutarConsulta(id);
    }
}
