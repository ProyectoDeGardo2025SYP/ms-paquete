package co.edu.uco.burstcar.paquete.dominio.validador;

import java.util.Collection;

public class ValidadorDeObjetos {

    private ValidadorDeObjetos() {
    }

    public static void validarNoNulos(Object valor, String nombreAtributo) {
        if(valor == null) {
            throw new IllegalArgumentException("El atributo" + nombreAtributo +" no puede estar nulo");
        }
    }

    public static void validarColeccionesVacios(Object valor, String nombreAtributo) {
        if (valor instanceof Collection<?> && ((Collection<?>) valor).isEmpty()) {
            throw new IllegalArgumentException("La lista de " + nombreAtributo + " no puede estar vacía");
        }
    }
}
