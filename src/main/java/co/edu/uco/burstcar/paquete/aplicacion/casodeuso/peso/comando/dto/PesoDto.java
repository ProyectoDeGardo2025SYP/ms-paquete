package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.comando.dto;

import co.edu.uco.burstcar.paquete.dominio.modelo.EntidadIdentificador;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class PesoDto extends EntidadIdentificador {

    private Double valor;
    private String nombreMedida;
    private UUID contenidoId;

    public PesoDto(Double valor, UUID contenidoId, String nombreMedida) {
        this.valor = valor;
        this.contenidoId = contenidoId;
        this.nombreMedida = nombreMedida;
    }
}
