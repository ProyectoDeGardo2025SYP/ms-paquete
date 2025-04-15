package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.serviciopaquete.entidad;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.EntidadIdentificador;
import jakarta.persistence.*;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "servicio_paquete", schema = "paquete")
public class EntidadServicioPaquete extends EntidadIdentificador {

    @Column(length = 30)
    private String nombreSolicitante;
    @Column(length = 12)
    private String numeroIdentificacion;
    @Column
    private UUID codigoIdentificador;
    @Column(length = 5)
    private String tipoIdentificacion;
    @Column
    private UUID identificadorEstadoServicio;
    @Column(length = 20)
    private String nombreEstado;
    @Column
    private UUID ubicacionIdentificador;
    @Column
    private Double latitudServicio;
    @Column
    private Double longitudServicio;
    @Column(length = 100)
    private String detalleAdicionalServicio;
    @Column
    private UUID identificadorDestino;
    @Column(length = 25)
    private String nombreDestinatario;
    @Column(length = 12)
    private String identificacionDestinatario;
    @Column(length = 3)
    private String codigoMoneda;
    @Column
    private Double costoInicialSolicitante;
    @Column
    private UUID identificadorMoneda;

    public EntidadServicioPaquete() {
    }

    public EntidadServicioPaquete(String nombreSolicitante, String numeroIdentificacion, UUID codigoIdentificador, String tipoIdentificacion, UUID identificadorEstadoServicio, String nombreEstado, UUID ubicacionIdentificador, Double latitudServicio, Double longitudServicio, String detalleAdicionalServicio, UUID identificadorDestino, String nombreDestinatario, String identificacionDestinatario, String codigoMoneda, Double costoInicialSolicitante, UUID identificadorMoneda) {
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
