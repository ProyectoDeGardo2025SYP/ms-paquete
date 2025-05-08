package co.edu.uco.burstcar.paquete.dominio.modelo;

import co.edu.uco.burstcar.paquete.dominio.validador.ValidadorDeAtibutos;

import java.util.UUID;


public class MedidaPaquete extends EntidadIdentificador{
    private String nombreMedida;
    private String abreviaturaMedida;
    private UUID identificadorTipoUnidad;
    private String nombreTipoUnidadMetrica;

    private MedidaPaquete(String nombreMedida, String abreviaturaMedida, UUID identificadorTipoUnidad, String nombreTipoUnidadMetrica) {
        this.nombreMedida = nombreMedida;
        this.abreviaturaMedida = abreviaturaMedida;
        this.identificadorTipoUnidad = identificadorTipoUnidad;
        this.nombreTipoUnidadMetrica = nombreTipoUnidadMetrica;
    }

    public static MedidaPaquete nuevaMedida(String nombreMedida, String abreviaturaMedida, UUID identificadorTipoUnidad, String nombreTipoUnidadMetrica) {
        ValidadorDeAtibutos.validarAtributosTexto(nombreMedida, "nombre de la medida", 15);
        ValidadorDeAtibutos.validarAtributosTexto(abreviaturaMedida, "abreavitura de la medida", 3);
        ValidadorDeAtibutos.validarAtributosTexto(nombreTipoUnidadMetrica, "nombre del tipo de la unidad metrica", 10);
        return new MedidaPaquete(nombreMedida, abreviaturaMedida, identificadorTipoUnidad, nombreTipoUnidadMetrica);
    }

    private MedidaPaquete(UUID identificador, String nombreMedida, String abreviaturaMedida, UUID identificadorTipoUnidad, String nombreTipoUnidadMetrica) {
        super(identificador);
        this.nombreMedida = nombreMedida;
        this.abreviaturaMedida = abreviaturaMedida;
        this.identificadorTipoUnidad = identificadorTipoUnidad;
        this.nombreTipoUnidadMetrica = nombreTipoUnidadMetrica;
    }

    public static MedidaPaquete nuevaMedidaConIdentificador(UUID id, String nombreMedida, String abreviaturaMedida, UUID identificadorTipoUnidad, String nombreTipoUnidadMetrica) {
        ValidadorDeAtibutos.validarAtributosTexto(nombreMedida, "nombre de la medida", 15);
        ValidadorDeAtibutos.validarAtributosTexto(abreviaturaMedida, "abreavitura de la medida", 3);
        ValidadorDeAtibutos.validarAtributosTexto(nombreTipoUnidadMetrica, "nombre del tipo de la unidad metrica", 10);
        return new MedidaPaquete(id, nombreMedida, abreviaturaMedida, identificadorTipoUnidad, nombreTipoUnidadMetrica);
    }

    public String getNombreMedida() {
        return nombreMedida;
    }

    public String getAbreviaturaMedida() {
        return abreviaturaMedida;
    }

    public UUID getIdentificadorTipoUnidad() {
        return identificadorTipoUnidad;
    }

    public String getNombreTipoUnidadMetrica() {
        return nombreTipoUnidadMetrica;
    }
}
