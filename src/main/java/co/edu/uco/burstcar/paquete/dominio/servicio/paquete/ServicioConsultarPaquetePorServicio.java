package co.edu.uco.burstcar.paquete.dominio.servicio.paquete;


import co.edu.uco.burstcar.paquete.dominio.dto.PaqueteConsultaPorServicioDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPaquete;

import java.util.List;
import java.util.UUID;

public class ServicioConsultarPaquetePorServicio {
    private final RepositorioPaquete repositorioPaquete;

    public ServicioConsultarPaquetePorServicio(RepositorioPaquete repositorioPaquete) {
        this.repositorioPaquete = repositorioPaquete;
    }

    public List<PaqueteConsultaPorServicioDto> ejecutarConsulta(UUID idPaquete){
        return this.repositorioPaquete.consultarPaquetePorServicio(idPaquete);
    }
}
