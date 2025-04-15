package co.edu.uco.burstcar.paquete.dominio.puerto;


import co.edu.uco.burstcar.paquete.dominio.modelo.TipoPaquete;

import java.util.List;

public interface RepositorioTipoPaquete {

    TipoPaquete asociarMonedaPaquete(String nombre);
    List<TipoPaquete> consultarMonedasPaquete();

}
