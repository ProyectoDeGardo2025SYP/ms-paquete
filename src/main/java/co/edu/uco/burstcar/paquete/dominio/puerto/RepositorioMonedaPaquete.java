package co.edu.uco.burstcar.paquete.dominio.puerto;


import co.edu.uco.burstcar.paquete.dominio.modelo.MonedaPaquete;

import java.util.List;

public interface RepositorioMonedaPaquete {

    MonedaPaquete asociarMonedaPaquete(String nombre);
    List<MonedaPaquete> consultarMonedasPaquete();

}
