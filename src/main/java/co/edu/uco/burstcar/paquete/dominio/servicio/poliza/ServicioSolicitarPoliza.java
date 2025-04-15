package co.edu.uco.burstcar.paquete.dominio.servicio.poliza;

import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;
import co.edu.uco.burstcar.paquete.dominio.modelo.Poliza;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPoliza;

import java.util.UUID;

public class ServicioSolicitarPoliza {

    private final RepositorioPoliza repositorioPoliza;

    public ServicioSolicitarPoliza(RepositorioPoliza repositorioPoliza) {
        this.repositorioPoliza = repositorioPoliza;
    }

    public UUID ejecutarRegistro(Poliza poliza){
        return this.repositorioPoliza.solicitarPolizasSeguroPaquetes(poliza);
    }
}
