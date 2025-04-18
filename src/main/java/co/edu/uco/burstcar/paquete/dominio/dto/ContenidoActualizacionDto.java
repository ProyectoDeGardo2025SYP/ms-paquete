package co.edu.uco.burstcar.paquete.dominio.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ContenidoActualizacionDto {
    private String descripcion;
    private Boolean fragil;
    private Double valorAproximado;
    private String monedaPaquete;
}
