package co.edu.uco.burstcar.paquete.dominio.modelo;

import co.edu.uco.burstcar.paquete.dominio.validador.ValidadorDeAtibutos;
import co.edu.uco.burstcar.paquete.dominio.validador.ValidadorDeObjetos;
import jakarta.validation.constraints.Size;
import java.util.UUID;


public class ServicioPaquete extends EntidadIdentificador{
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

    private ServicioPaquete(String nombreSolicitante, String numeroIdentificacion, UUID codigoIdentificador, String tipoIdentificacion, UUID identificadorEstadoServicio, String nombreEstado, UUID ubicacionIdentificador, Double latitudServicio, Double longitudServicio, String detalleAdicionalServicio, UUID identificadorDestino, String nombreDestinatario, String identificacionDestinatario, String codigoMoneda, Double costoInicialSolicitante, UUID identificadorMoneda) {
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

    public static ServicioPaquete nuevoServicioPaquete(String nombreSolicitante, String numeroIdentificacion, UUID codigoIdentificador, String tipoIdentificacion, UUID identificadorEstadoServicio, String nombreEstado, UUID ubicacionIdentificador, Double latitudServicio, Double longitudServicio, String detalleAdicionalServicio, UUID identificadorDestino, String nombreDestinatario, String identificacionDestinatario, String codigoMoneda, Double costoInicialSolicitante, UUID identificadorMoneda) {
        ValidadorDeAtibutos.validarAtributosTexto(nombreSolicitante, "nombre solicitante", 30);
        ValidadorDeAtibutos.validarAtributosTexto(numeroIdentificacion, "número de identificación solicitante", 12);
        ValidadorDeAtibutos.validarAtributosTexto(tipoIdentificacion, "tipo de identificación solicitante", 5);
        ValidadorDeAtibutos.validarAtributosTexto(nombreEstado, "nombre del estado del servicio", 20);
        ValidadorDeObjetos.validarNoNulos(latitudServicio, "latitud de la ubicación de un servicio");
        ValidadorDeObjetos.validarNoNulos(longitudServicio, "longitud de la ubicación de un servicio");
        ValidadorDeAtibutos.validarAtributosTexto(detalleAdicionalServicio, "detalle adicional del servicio", 100);
        ValidadorDeAtibutos.validarAtributosTexto(nombreDestinatario, "nombre del destinatario", 25);
        ValidadorDeAtibutos.validarAtributosTexto(identificacionDestinatario, "identificación del destinatario", 12);
        ValidadorDeAtibutos.validarAtributosTexto(codigoMoneda, "moneda", 3);
        ValidadorDeObjetos.validarNoNulos(costoInicialSolicitante, "costo inicial del solicitante");
        return new ServicioPaquete(nombreSolicitante, numeroIdentificacion, codigoIdentificador, tipoIdentificacion, identificadorEstadoServicio,
                nombreEstado, ubicacionIdentificador, latitudServicio, longitudServicio, detalleAdicionalServicio, identificadorDestino,
                nombreDestinatario, identificacionDestinatario, codigoMoneda, costoInicialSolicitante, identificadorMoneda);

    }

    private ServicioPaquete(UUID identificador, String nombreSolicitante, String numeroIdentificacion, UUID codigoIdentificador, String tipoIdentificacion, UUID identificadorEstadoServicio, String nombreEstado, UUID ubicacionIdentificador, Double latitudServicio, Double longitudServicio, String detalleAdicionalServicio, UUID identificadorDestino, String nombreDestinatario, String identificacionDestinatario, String codigoMoneda, Double costoInicialSolicitante, UUID identificadorMoneda) {
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

    public static ServicioPaquete nuevoServicioPaqueteConIdentificador(UUID id, String nombreSolicitante, String numeroIdentificacion, UUID codigoIdentificador, String tipoIdentificacion, UUID identificadorEstadoServicio, String nombreEstado, UUID ubicacionIdentificador, Double latitudServicio, Double longitudServicio, String detalleAdicionalServicio, UUID identificadorDestino, String nombreDestinatario, String identificacionDestinatario, String codigoMoneda, Double costoInicialSolicitante, UUID identificadorMoneda) {
        ValidadorDeAtibutos.validarAtributosTexto(nombreSolicitante, "nombre solicitante", 30);
        ValidadorDeAtibutos.validarAtributosTexto(numeroIdentificacion, "número de identificación solicitante", 12);
        ValidadorDeAtibutos.validarAtributosTexto(tipoIdentificacion, "tipo de identificación solicitante", 5);
        ValidadorDeAtibutos.validarAtributosTexto(nombreEstado, "nombre del estado del servicio", 20);
        ValidadorDeObjetos.validarNoNulos(latitudServicio, "latitud de la ubicación de un servicio");
        ValidadorDeObjetos.validarNoNulos(longitudServicio, "longitud de la ubicación de un servicio");
        ValidadorDeAtibutos.validarAtributosTexto(detalleAdicionalServicio, "detalle adicional del servicio", 100);
        ValidadorDeAtibutos.validarAtributosTexto(nombreDestinatario, "nombre del destinatario", 25);
        ValidadorDeAtibutos.validarAtributosTexto(identificacionDestinatario, "identificación del destinatario", 12);
        ValidadorDeAtibutos.validarAtributosTexto(codigoMoneda, "moneda", 3);
        ValidadorDeObjetos.validarNoNulos(costoInicialSolicitante, "costo inicial del solicitante");
        return new ServicioPaquete(id, nombreSolicitante, numeroIdentificacion, codigoIdentificador, tipoIdentificacion, identificadorEstadoServicio,
                nombreEstado, ubicacionIdentificador, latitudServicio, longitudServicio, detalleAdicionalServicio, identificadorDestino,
                nombreDestinatario, identificacionDestinatario, codigoMoneda, costoInicialSolicitante, identificadorMoneda);

    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public UUID getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public UUID getIdentificadorEstadoServicio() {
        return identificadorEstadoServicio;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public UUID getUbicacionIdentificador() {
        return ubicacionIdentificador;
    }

    public Double getLatitudServicio() {
        return latitudServicio;
    }

    public Double getLongitudServicio() {
        return longitudServicio;
    }

    public String getDetalleAdicionalServicio() {
        return detalleAdicionalServicio;
    }

    public UUID getIdentificadorDestino() {
        return identificadorDestino;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public String getIdentificacionDestinatario() {
        return identificacionDestinatario;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public Double getCostoInicialSolicitante() {
        return costoInicialSolicitante;
    }

    public UUID getIdentificadorMoneda() {
        return identificadorMoneda;
    }
}
