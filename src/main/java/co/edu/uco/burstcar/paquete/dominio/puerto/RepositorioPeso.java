package co.edu.uco.burstcar.paquete.dominio.puerto;

import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;

import java.util.UUID;

public interface RepositorioPeso {

    UUID registrarPesoContenido(Peso peso);
    void actualizarPesoContenido(Peso peso);
    Peso consultarPeso(UUID identificador);
}
