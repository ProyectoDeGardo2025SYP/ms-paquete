package co.edu.uco.burstcar.paquete.dominio.dto;

import co.edu.uco.burstcar.paquete.dominio.modelo.Contenido;
import co.edu.uco.burstcar.paquete.dominio.modelo.EntidadIdentificador;
import co.edu.uco.burstcar.paquete.dominio.modelo.TipoPaquete;

import java.util.UUID;

public class PaqueteConsultaPorServicioDto extends EntidadIdentificador {
    private String descripcion;
    private TipoPaquete tipoPaquete;
    private Contenido contenido;

    private PaqueteConsultaPorServicioDto(String descripcion, TipoPaquete tipoPaquete, Contenido contenido) {
        this.descripcion = descripcion;
        this.tipoPaquete = tipoPaquete;
        this.contenido = contenido;
    }

    public static PaqueteConsultaPorServicioDto consultaPorServicioDto(String descripcion, TipoPaquete tipoPaquete, Contenido contenido) {
        return new PaqueteConsultaPorServicioDto(descripcion, tipoPaquete, contenido);
    }

    private PaqueteConsultaPorServicioDto(UUID identificador, String descripcion, TipoPaquete tipoPaquete, Contenido contenido) {
        super(identificador);
        this.descripcion = descripcion;
        this.tipoPaquete = tipoPaquete;
        this.contenido = contenido;
    }

    public static PaqueteConsultaPorServicioDto consultaPorServicioDtoConIdentificador(UUID id, String descripcion, TipoPaquete tipoPaquete, Contenido contenido) {
        return new PaqueteConsultaPorServicioDto(id,descripcion, tipoPaquete, contenido);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoPaquete getTipoPaquete() {
        return tipoPaquete;
    }

    public Contenido getContenido() {
        return contenido;
    }
}
