package co.edu.uco.burstcar.paquete.dominio.puerto;

import co.edu.uco.burstcar.paquete.dominio.modelo.Poliza;

import java.util.UUID;

public interface RepositorioPoliza {

    UUID solicitarPolizasSeguroPaquetes(Poliza poliza);
    Poliza consultarPoliza(UUID identificador);

}
