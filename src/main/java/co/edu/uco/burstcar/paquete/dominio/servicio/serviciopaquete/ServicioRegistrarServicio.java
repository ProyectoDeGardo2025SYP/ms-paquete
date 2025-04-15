package co.edu.uco.burstcar.paquete.dominio.servicio.serviciopaquete;

import co.edu.uco.burstcar.paquete.dominio.modelo.ServicioPaquete;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioServicioPaquete;

import java.util.UUID;

public class ServicioRegistrarServicio {
    private final RepositorioServicioPaquete repositorioServicioPaquete;

    public ServicioRegistrarServicio(RepositorioServicioPaquete repositorioServicioPaquete) {
        this.repositorioServicioPaquete = repositorioServicioPaquete;
    }

    public void ejecutarRegistro(ServicioPaquete servicioPaquete){
        this.repositorioServicioPaquete.registrarServicio(servicioPaquete);
    }
}
