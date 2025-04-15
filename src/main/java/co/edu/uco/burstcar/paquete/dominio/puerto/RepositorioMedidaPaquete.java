package co.edu.uco.burstcar.paquete.dominio.puerto;


import co.edu.uco.burstcar.paquete.dominio.modelo.MedidaPaquete;

import java.util.List;

public interface RepositorioMedidaPaquete {

    MedidaPaquete asociarMedidaPaquete(String nombre);
    List<MedidaPaquete> consultarMonedasPaquete();

}
