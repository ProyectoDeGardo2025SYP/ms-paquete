package co.edu.uco.burstcar.paquete.dominio.modelo;

import co.edu.uco.burstcar.paquete.dominio.validador.ValidadorDeObjetos;

import java.util.ArrayList;
import java.util.UUID;


public class Poliza extends EntidadIdentificador{

    private Boolean asegurado;
    private Double valor;
    private MonedaPaquete monedaPaquete;
    private ArrayList<Paquete> paquetes;

    private Poliza(Boolean asegurado, Double valor, MonedaPaquete monedaPaquete, ArrayList<Paquete> paquetes) {
        this.asegurado = asegurado;
        this.valor = valor;
        this.monedaPaquete = monedaPaquete;
        this.paquetes = paquetes;
    }

    public static Poliza nuevaPoliza(Boolean asegurado, Double valor, MonedaPaquete monedaPaquete, ArrayList<Paquete> paquetes) {
        ValidadorDeObjetos.validarNoNulos(asegurado, "asegurado");
        ValidadorDeObjetos.validarNoNulos(valor, "valor");
        ValidadorDeObjetos.validarNoNulos(monedaPaquete, "moneda");
        ValidadorDeObjetos.validarColeccionesVacios(paquetes, "paquetes");
        return new Poliza(asegurado, valor, monedaPaquete, paquetes);
    }

    private Poliza(UUID identificador, Boolean asegurado, Double valor, MonedaPaquete monedaPaquete, ArrayList<Paquete> paquetes) {
        super(identificador);
        this.asegurado = asegurado;
        this.valor = valor;
        this.monedaPaquete = monedaPaquete;
        this.paquetes = paquetes;
    }

    public static Poliza nuevaPolizaConIdentificador(UUID id, Boolean asegurado, Double valor, MonedaPaquete monedaPaquete, ArrayList<Paquete> paquetes) {
        ValidadorDeObjetos.validarNoNulos(asegurado, "asegurado");
        ValidadorDeObjetos.validarNoNulos(valor, "valor");
        ValidadorDeObjetos.validarNoNulos(monedaPaquete, "moneda");
        ValidadorDeObjetos.validarColeccionesVacios(paquetes, "paquetes");
        return new Poliza(id, asegurado, valor, monedaPaquete, paquetes);
    }

    public Boolean getAsegurado() {
        return asegurado;
    }

    public Double getValor() {
        return valor;
    }

    public MonedaPaquete getMonedaPaquete() {
        return monedaPaquete;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }
}
