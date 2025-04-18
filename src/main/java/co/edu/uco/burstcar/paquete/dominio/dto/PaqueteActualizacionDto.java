package co.edu.uco.burstcar.paquete.dominio.dto;

import co.edu.uco.burstcar.paquete.dominio.modelo.Contenido;
import co.edu.uco.burstcar.paquete.dominio.modelo.ServicioPaquete;
import co.edu.uco.burstcar.paquete.dominio.modelo.TipoPaquete;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class PaqueteActualizacionDto {
    private String descripcion;
    private String tipoPaqueteNombre;
    private UUID idContenido;
}
