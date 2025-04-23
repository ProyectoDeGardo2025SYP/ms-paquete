package co.edu.uco.burstcar.paquete.dominio.servicio.peso;


import co.edu.uco.burstcar.paquete.dominio.dto.PesoConsultaDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPeso;

import java.util.UUID;

public class ServicioConsultarPesoPorContenido {
    private final RepositorioPeso repositorioPeso;

    public ServicioConsultarPesoPorContenido(RepositorioPeso repositorioPeso) {
        this.repositorioPeso = repositorioPeso;
    }

    public PesoConsultaDto ejecutarConsulta(UUID idContenido){
        return this.repositorioPeso.consultarPesoPorContenido(idContenido);
    }
}
