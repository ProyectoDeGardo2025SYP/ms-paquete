package co.edu.uco.burstcar.paquete.dominio.modelo;

import co.edu.uco.burstcar.paquete.dominio.validador.ValidadorDeAtibutos;

import java.util.UUID;


public class Paquete extends EntidadIdentificador{
    private String descripcion;
    private TipoPaquete tipoPaquete;
    private Contenido contenido;
    private ServicioPaquete servicioPaquete;

    private Paquete(String descripcion, TipoPaquete tipoPaquete, Contenido contenido, ServicioPaquete servicioPaquete) {
        this.descripcion = descripcion;
        this.tipoPaquete = tipoPaquete;
        this.contenido = contenido;
        this.servicioPaquete = servicioPaquete;
    }

    public static Paquete nuevoPaquete(String descripcion, TipoPaquete tipoPaquete, Contenido contenido, ServicioPaquete servicioPaquete) {
        ValidadorDeAtibutos.validarAtributosTexto(descripcion, "descripción del paquete", 150);
        ValidadorDeAtibutos.validarObjetoNoNulo(tipoPaquete, "tipo de paquete");
        ValidadorDeAtibutos.validarObjetoNoNulo(contenido, "contenido");
        ValidadorDeAtibutos.validarObjetoNoNulo(servicioPaquete, "servicio asociado al paquete");
        return new Paquete(descripcion, tipoPaquete, contenido, servicioPaquete);
    }

    private Paquete(UUID identificador, String descripcion, TipoPaquete tipoPaquete, Contenido contenido, ServicioPaquete servicioPaquete) {
        super(identificador);
        this.descripcion = descripcion;
        this.tipoPaquete = tipoPaquete;
        this.contenido = contenido;
        this.servicioPaquete = servicioPaquete;
    }

    public static Paquete nuevoPaqueteConIdentificador(UUID id, String descripcion, TipoPaquete tipoPaquete, Contenido contenido, ServicioPaquete servicioPaquete) {
        ValidadorDeAtibutos.validarAtributosTexto(descripcion, "descripción del paquete", 150);
        ValidadorDeAtibutos.validarObjetoNoNulo(tipoPaquete, "tipo de paquete");
        ValidadorDeAtibutos.validarObjetoNoNulo(contenido, "contenido");
        ValidadorDeAtibutos.validarObjetoNoNulo(servicioPaquete, "servicio asociado al paquete");
        return new Paquete(id, descripcion, tipoPaquete, contenido, servicioPaquete);
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

    public ServicioPaquete getServicioPaquete() {
        return servicioPaquete;
    }
}
