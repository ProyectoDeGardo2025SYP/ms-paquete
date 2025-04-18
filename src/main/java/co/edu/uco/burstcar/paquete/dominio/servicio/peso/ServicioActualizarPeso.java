package co.edu.uco.burstcar.paquete.dominio.servicio.peso;

import co.edu.uco.burstcar.paquete.dominio.dto.ContenidoActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.dto.PesoActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPeso;

import java.util.UUID;

public class ServicioActualizarPeso {
    private final RepositorioPeso repositorioPeso;

    public ServicioActualizarPeso(RepositorioPeso repositorioPeso) {
        this.repositorioPeso = repositorioPeso;
    }

    public void ejecutarActualizar(PesoActualizacionDto dto, UUID idPeso){
        this.repositorioPeso.actualizarPesoContenido(dto, idPeso);
    }
}
