package co.edu.uco.burstcar.paquete.dominio.puerto;

import co.edu.uco.burstcar.paquete.dominio.dto.PesoActualizacionDto;
import co.edu.uco.burstcar.paquete.dominio.dto.PesoConsultaDto;
import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;

import java.util.List;
import java.util.UUID;

public interface RepositorioPeso {

    UUID registrarPesoContenido(Peso peso);
    void actualizarPesoContenido(PesoActualizacionDto dto, UUID idPeso);
    Peso consultarPeso(UUID identificador);
    PesoConsultaDto consultarPesoPorContenido(UUID idContenido);
}
