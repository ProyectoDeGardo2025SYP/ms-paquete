package co.edu.uco.burstcar.paquete.dominio.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class PesoActualizacionDto {
    private Double valor;
    private UUID idContenido;
    private UUID idMedidaPaquete;

}
