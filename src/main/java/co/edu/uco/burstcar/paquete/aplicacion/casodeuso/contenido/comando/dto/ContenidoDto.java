package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando.dto;

import co.edu.uco.burstcar.paquete.dominio.modelo.EntidadIdentificador;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ContenidoDto extends EntidadIdentificador {
    private String descripcion;
    private Boolean fragil;
    private Double valorAproximado;
    private String monedaPaquete;


    public ContenidoDto(String descripcion, Boolean fragil, Double valorAproximado, String monedaPaquete) {
        this.descripcion = descripcion;
        this.fragil = fragil;
        this.valorAproximado = valorAproximado;
        this.monedaPaquete = monedaPaquete;
    }
}
