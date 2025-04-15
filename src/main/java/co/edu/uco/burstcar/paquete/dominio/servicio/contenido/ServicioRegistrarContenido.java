package co.edu.uco.burstcar.paquete.dominio.servicio.contenido;

import co.edu.uco.burstcar.paquete.dominio.modelo.Contenido;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioContenido;

import java.util.UUID;

public class ServicioRegistrarContenido {
    private final RepositorioContenido repositorioContenido;

    public ServicioRegistrarContenido(RepositorioContenido repositorioContenido) {
        this.repositorioContenido = repositorioContenido;
    }

    public UUID ejecutarRegistro(Contenido contenido){
        return this.repositorioContenido.registrarInformacionContenido(contenido);
    }
}
