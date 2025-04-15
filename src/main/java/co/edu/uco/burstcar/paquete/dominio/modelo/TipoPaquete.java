package co.edu.uco.burstcar.paquete.dominio.modelo;

import co.edu.uco.burstcar.paquete.dominio.validador.ValidadorDeAtibutos;
import java.util.UUID;


public class TipoPaquete extends EntidadIdentificador{
    private String descripcion;
    private String nombre;

    private TipoPaquete(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public static TipoPaquete nuevoTipoPaquete(String descripcion, String nombre) {
        ValidadorDeAtibutos.validarAtributosTexto(descripcion, "descripción del estado del paquete", 100);
        ValidadorDeAtibutos.validarAtributosTexto(nombre, "nombre del estado del paquete", 15);
        return new TipoPaquete(descripcion, nombre);
    }

    private TipoPaquete(UUID identificador, String descripcion, String nombre) {
        super(identificador);
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public static TipoPaquete nuevoTipoPaqueteConIdentificador(UUID id, String descripcion, String nombre) {
        ValidadorDeAtibutos.validarAtributosTexto(descripcion, "descripción del estado del paquete", 100);
        ValidadorDeAtibutos.validarAtributosTexto(nombre, "nombre del estado del paquete", 15);
        return new TipoPaquete(id, descripcion, nombre);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }
}
