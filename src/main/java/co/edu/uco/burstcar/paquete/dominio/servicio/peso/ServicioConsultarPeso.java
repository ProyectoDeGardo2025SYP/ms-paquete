package co.edu.uco.burstcar.paquete.dominio.servicio.peso;


import co.edu.uco.burstcar.paquete.dominio.modelo.Paquete;
import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPeso;

import java.util.UUID;

public class ServicioConsultarPeso {
    private final RepositorioPeso repositorioPeso;

    public ServicioConsultarPeso(RepositorioPeso repositorioPeso) {
        this.repositorioPeso = repositorioPeso;
    }

    public Peso ejecutarConsulta(UUID idPeso){
        return this.repositorioPeso.consultarPeso(idPeso);
    }
}
