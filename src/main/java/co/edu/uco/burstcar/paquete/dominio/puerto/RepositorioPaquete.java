package co.edu.uco.burstcar.paquete.dominio.puerto;

import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;

import java.util.UUID;

public interface RepositorioPaquete {

    UUID registrarInformacionNuevoPaquete(Paquete paquete);
    void actualizarInformacionPaquete(Paquete paquete);
    Paquete consultarContenido(UUID identificador);
}
