package co.edu.uco.burstcar.paquete.dominio.modelo;

import co.edu.uco.burstcar.paquete.dominio.validador.ValidadorDeObjetos;

import java.util.UUID;


public class Peso extends EntidadIdentificador{

    private Double valor;
    private Contenido contenido;
    private MedidaPaquete medidaPaquete;

    private Peso(Double valor, Contenido contenido, MedidaPaquete medidaPaquete) {
        this.valor = valor;
        this.contenido = contenido;
        this.medidaPaquete = medidaPaquete;
    }

    public static Peso nuevoPeso(Double valor, Contenido contenido, MedidaPaquete medidaPaquete) {
        ValidadorDeObjetos.validarNoNulos(valor, "valor del peso");
        ValidadorDeObjetos.validarNoNulos(contenido, "contenido");
        ValidadorDeObjetos.validarNoNulos(medidaPaquete, "medida");
        return new Peso(valor, contenido, medidaPaquete);
    }

    private Peso(UUID identificador, Double valor, Contenido contenido, MedidaPaquete medidaPaquete) {
        super(identificador);
        this.valor = valor;
        this.contenido = contenido;
        this.medidaPaquete = medidaPaquete;
    }

    public static Peso nuevoPesoConIdentificador(UUID id, Double valor, Contenido contenido, MedidaPaquete medidaPaquete) {
        ValidadorDeObjetos.validarNoNulos(valor, "valor del peso");
        ValidadorDeObjetos.validarNoNulos(contenido, "contenido");
        ValidadorDeObjetos.validarNoNulos(medidaPaquete, "medida");
        return new Peso(id, valor, contenido, medidaPaquete);
    }

    public Double getValor() {
        return valor;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public MedidaPaquete getMedidaPaquete() {
        return medidaPaquete;
    }
}
