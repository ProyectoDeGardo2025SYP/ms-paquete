package co.edu.uco.burstcar.paquete.dominio.servicio.peso;

import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPeso;

import java.util.UUID;

public class ServicioRegistrarPeso {
    private final RepositorioPeso repositorioPeso;

    public ServicioRegistrarPeso(RepositorioPeso repositorioPeso) {
        this.repositorioPeso = repositorioPeso;
    }

    public UUID ejecutarRegistro(Peso peso){
        return this.repositorioPeso.registrarPesoContenido(peso);
    }
}
