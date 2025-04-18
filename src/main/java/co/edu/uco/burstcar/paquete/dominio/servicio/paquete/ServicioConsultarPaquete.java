package co.edu.uco.burstcar.paquete.dominio.servicio.paquete;


import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPaquete;

import java.util.UUID;

public class ServicioConsultarPaquete {
    private final RepositorioPaquete repositorioPaquete;

    public ServicioConsultarPaquete(RepositorioPaquete repositorioPaquete) {
        this.repositorioPaquete = repositorioPaquete;
    }

    public Paquete ejecutarConsulta(UUID idPaquete){
        return this.repositorioPaquete.consultarPaquete(idPaquete);
    }
}
