package co.edu.uco.burstcar.paquete.dominio.servicio.paquete;

import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPaquete;

import java.util.UUID;

public class ServicioRegistrarPaquete {
    private final RepositorioPaquete repositorioPaquete;

    public ServicioRegistrarPaquete(RepositorioPaquete repositorioPaquete) {
        this.repositorioPaquete = repositorioPaquete;
    }


    public UUID ejecutarRegistro(Paquete paquete){
        return this.repositorioPaquete.registrarInformacionNuevoPaquete(paquete);
    }
}
