package co.edu.uco.burstcar.paquete.dominio.puerto;

import co.edu.uco.burstcar.paquete.dominio.modelo.Contenido;

import java.util.UUID;

public interface RepositorioContenido {

    UUID registrarInformacionContenido(Contenido contenido);
    void actualizarInformacionContenido(Contenido contenido);
    Contenido consultarContenido(UUID identificador);
}
