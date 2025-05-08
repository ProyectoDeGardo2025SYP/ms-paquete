package co.edu.uco.burstcar.paquete.dominio.modelo;

import co.edu.uco.burstcar.paquete.dominio.validador.ValidadorDeAtibutos;

import java.util.UUID;

public class Contenido extends EntidadIdentificador{
    private String descripcion;
    private Boolean fragil;
    private Double valorAproximado;
    private MonedaPaquete monedaPaquete;

    private Contenido(String descripcion, Boolean fragil, Double valorAproximado, MonedaPaquete monedaPaquete) {
        this.descripcion = descripcion;
        this.fragil = fragil;
        this.valorAproximado = valorAproximado;
        this.monedaPaquete = monedaPaquete;
    }

    public static Contenido nuevoContenido(String descripcion, Boolean fragil, Double valorAproximado, MonedaPaquete monedaPaquete) {
        ValidadorDeAtibutos.validarAtributosTexto(descripcion, "descripción", 15);
        ValidadorDeAtibutos.validarObjetoNoNulo(fragil, "fragil");
        ValidadorDeAtibutos.validarObjetoNoNulo(valorAproximado, "valor aproximado");
        ValidadorDeAtibutos.validarObjetoNoNulo(monedaPaquete, "moneda");
        return new Contenido(descripcion, fragil, valorAproximado, monedaPaquete);
    }

    private Contenido(UUID identificador, String descripcion, Boolean fragil, Double valorAproximado, MonedaPaquete monedaPaquete) {
        super(identificador);
        this.descripcion = descripcion;
        this.fragil = fragil;
        this.valorAproximado = valorAproximado;
        this.monedaPaquete = monedaPaquete;
    }

    public static Contenido nuevoContenidoConIdentificador(UUID id, String descripcion, Boolean fragil, Double valorAproximado, MonedaPaquete monedaPaquete) {
        ValidadorDeAtibutos.validarAtributosTexto(descripcion, "descripción", 15);
        ValidadorDeAtibutos.validarObjetoNoNulo(fragil, "fragil");
        ValidadorDeAtibutos.validarObjetoNoNulo(valorAproximado, "valor aproximado");
        ValidadorDeAtibutos.validarObjetoNoNulo(monedaPaquete, "moneda");
        return new Contenido(id, descripcion, fragil, valorAproximado, monedaPaquete);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getFragil() {
        return fragil;
    }

    public Double getValorAproximado() {
        return valorAproximado;
    }

    public MonedaPaquete getMonedaPaquete() {
        return monedaPaquete;
    }
}
