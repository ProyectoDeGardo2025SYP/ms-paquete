package co.edu.uco.burstcar.paquete.dominio.puerto;


import co.edu.uco.burstcar.paquete.dominio.modelo.ServicioPaquete;

import java.util.UUID;

public interface RepositorioServicioPaquete {
    ServicioPaquete asociarServicioPaquete(UUID id);
    void registrarServicio(ServicioPaquete servicioPaquete);
}
