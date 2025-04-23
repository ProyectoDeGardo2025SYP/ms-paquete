package co.edu.uco.burstcar.paquete.dominio.dto;

import co.edu.uco.burstcar.paquete.dominio.modelo.EntidadIdentificador;
import co.edu.uco.burstcar.paquete.dominio.modelo.MedidaPaquete;

import java.util.UUID;


public class PesoConsultaDto extends EntidadIdentificador {
    private Double valor;
    private MedidaPaquete medidaPaquete;

    private PesoConsultaDto(Double valor, MedidaPaquete medidaPaquete) {
        this.valor = valor;
        this.medidaPaquete = medidaPaquete;
    }

    public static PesoConsultaDto nuevoPesoConsultaDto(Double valor, MedidaPaquete medidaPaquete) {
        return new PesoConsultaDto(valor, medidaPaquete);
    }

    private PesoConsultaDto(UUID identificador, Double valor, MedidaPaquete medidaPaquete) {
        super(identificador);
        this.valor = valor;
        this.medidaPaquete = medidaPaquete;
    }

    public static PesoConsultaDto nuevoPesoConsultaDtoConIdentificador(UUID id, Double valor, MedidaPaquete medidaPaquete) {
        return new PesoConsultaDto(id, valor, medidaPaquete);
    }

    public Double getValor() {
        return valor;
    }

    public MedidaPaquete getMedidaPaquete() {
        return medidaPaquete;
    }
}
