package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.poliza.comando.dto;

import co.edu.uco.burstcar.paquete.dominio.modelo.EntidadIdentificador;
import co.edu.uco.burstcar.paquete.dominio.modelo.MonedaPaquete;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
public class PolizaDto extends EntidadIdentificador {

    private Boolean asegurado;
    private Double valor;
    private String abreviaturaMoneda;
    private ArrayList<PaqueteDto> identificadorPaquetes;

    public PolizaDto(Boolean asegurado, Double valor, String abreviaturaMoneda, ArrayList<PaqueteDto> identificadorPaquetes) {
        this.asegurado = asegurado;
        this.valor = valor;
        this.abreviaturaMoneda = abreviaturaMoneda;
        this.identificadorPaquetes = identificadorPaquetes;
    }

    public PolizaDto(UUID identificador, Boolean asegurado, Double valor, String abreviaturaMoneda, ArrayList<PaqueteDto> identificadorPaquetes) {
        super(identificador);
        this.asegurado = asegurado;
        this.valor = valor;
        this.abreviaturaMoneda = abreviaturaMoneda;
        this.identificadorPaquetes = identificadorPaquetes;
    }
}
