package co.edu.uco.burstcar.paquete.dominio.modelo;

import co.edu.uco.burstcar.paquete.dominio.validador.ValidadorDeAtibutos;
import jakarta.validation.constraints.Size;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;


public class MonedaPaquete extends EntidadIdentificador{

    @Size(max = 30)
    private String nombreMoneda;

    @Size(max = 3)
    private String codigoMoneda;

    private MonedaPaquete(String nombreMoneda, String codigoMoneda) {
        this.nombreMoneda = nombreMoneda;
        this.codigoMoneda = codigoMoneda;
    }

    public static MonedaPaquete nuevaMonedaPaquete(String descripcion, String nombre) {
        ValidadorDeAtibutos.validarAtributosTexto(descripcion, "descripción de la moneda del paquete", 30);
        ValidadorDeAtibutos.validarAtributosTexto(nombre, "nombre de la moneda del paquete", 3);
        return new MonedaPaquete(descripcion, nombre);
    }


    private MonedaPaquete(UUID identificador, String nombreMoneda, String codigoMoneda) {
        super(identificador);
        this.nombreMoneda = nombreMoneda;
        this.codigoMoneda = codigoMoneda;
    }

    public static MonedaPaquete nuevaMonedaPaqueteConIdentificador(UUID id, String descripcion, String nombre) {
        ValidadorDeAtibutos.validarAtributosTexto(descripcion, "descripción de la moneda del paquete", 30);
        ValidadorDeAtibutos.validarAtributosTexto(nombre, "nombre de la moneda del paquete", 3);
        return new MonedaPaquete(id, descripcion, nombre);
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }
}
