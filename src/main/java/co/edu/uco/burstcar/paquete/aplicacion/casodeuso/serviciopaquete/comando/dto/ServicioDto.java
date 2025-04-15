package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.serviciopaquete.comando.dto;

import co.edu.uco.burstcar.paquete.dominio.modelo.EntidadIdentificador;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
public class ServicioDto extends EntidadIdentificador {

    private String nombreSolicitante;
    private String numeroIdentificacion;
    private UUID codigoIdentificador;
    private String tipoIdentificacion;
    private UUID identificadorEstadoServicio;
    private String nombreEstado;
    private UUID ubicacionIdentificador;
    private Double latitudServicio;
    private Double longitudServicio;
    private String detalleAdicionalServicio;
    private UUID identificadorDestino;
    private String nombreDestinatario;
    private String identificacionDestinatario;
    private String codigoMoneda;
    private Double costoInicialSolicitante;
    private UUID identificadorMoneda;

    public ServicioDto(String nombreSolicitante, String numeroIdentificacion, UUID codigoIdentificador, String tipoIdentificacion, UUID identificadorEstadoServicio, String nombreEstado, UUID ubicacionIdentificador, Double latitudServicio, Double longitudServicio, String detalleAdicionalServicio, UUID identificadorDestino, String nombreDestinatario, String identificacionDestinatario, String codigoMoneda, Double costoInicialSolicitante, UUID identificadorMoneda) {
        this.nombreSolicitante = nombreSolicitante;
        this.numeroIdentificacion = numeroIdentificacion;
        this.codigoIdentificador = codigoIdentificador;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificadorEstadoServicio = identificadorEstadoServicio;
        this.nombreEstado = nombreEstado;
        this.ubicacionIdentificador = ubicacionIdentificador;
        this.latitudServicio = latitudServicio;
        this.longitudServicio = longitudServicio;
        this.detalleAdicionalServicio = detalleAdicionalServicio;
        this.identificadorDestino = identificadorDestino;
        this.nombreDestinatario = nombreDestinatario;
        this.identificacionDestinatario = identificacionDestinatario;
        this.codigoMoneda = codigoMoneda;
        this.costoInicialSolicitante = costoInicialSolicitante;
        this.identificadorMoneda = identificadorMoneda;
    }

    public ServicioDto(UUID identificador, String nombreSolicitante, String numeroIdentificacion, UUID codigoIdentificador, String tipoIdentificacion, UUID identificadorEstadoServicio, String nombreEstado, UUID ubicacionIdentificador, Double latitudServicio, Double longitudServicio, String detalleAdicionalServicio, UUID identificadorDestino, String nombreDestinatario, String identificacionDestinatario, String codigoMoneda, Double costoInicialSolicitante, UUID identificadorMoneda) {
        super(identificador);
        this.nombreSolicitante = nombreSolicitante;
        this.numeroIdentificacion = numeroIdentificacion;
        this.codigoIdentificador = codigoIdentificador;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificadorEstadoServicio = identificadorEstadoServicio;
        this.nombreEstado = nombreEstado;
        this.ubicacionIdentificador = ubicacionIdentificador;
        this.latitudServicio = latitudServicio;
        this.longitudServicio = longitudServicio;
        this.detalleAdicionalServicio = detalleAdicionalServicio;
        this.identificadorDestino = identificadorDestino;
        this.nombreDestinatario = nombreDestinatario;
        this.identificacionDestinatario = identificacionDestinatario;
        this.codigoMoneda = codigoMoneda;
        this.costoInicialSolicitante = costoInicialSolicitante;
        this.identificadorMoneda = identificadorMoneda;
    }
}
