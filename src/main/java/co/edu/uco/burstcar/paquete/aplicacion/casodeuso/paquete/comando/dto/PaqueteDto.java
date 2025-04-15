package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando.dto;

import co.edu.uco.burstcar.paquete.dominio.modelo.EntidadIdentificador;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
public class PaqueteDto extends EntidadIdentificador {
    private String descripcion;
    private String tipoPaqueteNombre;
    private UUID contenido;
    private UUID servicioPaquete;



    public PaqueteDto(String descripcion, String tipoPaqueteNombre, UUID contenido, UUID servicioPaquete) {
        this.descripcion = descripcion;
        this.tipoPaqueteNombre = tipoPaqueteNombre;
        this.contenido = contenido;
        this.servicioPaquete = servicioPaquete;
    }

    public PaqueteDto(UUID identificador, String descripcion, String tipoPaqueteNombre, UUID contenido, UUID servicioPaquete) {
        super(identificador);
        this.descripcion = descripcion;
        this.tipoPaqueteNombre = tipoPaqueteNombre;
        this.contenido = contenido;
        this.servicioPaquete = servicioPaquete;
    }
}
