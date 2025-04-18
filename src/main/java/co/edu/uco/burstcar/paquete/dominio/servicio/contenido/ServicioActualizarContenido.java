package co.edu.uco.burstcar.paquete.dominio.servicio.contenido;

import co.edu.uco.burstcar.paquete.dominio.dto.ContenidoActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioContenido;

import java.util.UUID;

public class ServicioActualizarContenido {
    private final RepositorioContenido repositorioContenido;

    public ServicioActualizarContenido(RepositorioContenido repositorioContenido) {
        this.repositorioContenido = repositorioContenido;
    }

    public void ejecutarActualizar(ContenidoActualizacionDto dto, UUID idContendio){
        this.repositorioContenido.actualizarInformacionContenido(dto, idContendio);
    }
}
