package co.edu.uco.burstcar.paquete.aplicacion.mapeador.serviciopaquete.impl;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.serviciopaquete.comando.dto.ServicioDto;
import co.edu.uco.burstcar.paquete.aplicacion.mapeador.MapeadorAplicacion;
import co.edu.uco.burstcar.paquete.dominio.modelo.ServicioPaquete;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioServicioPaquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MapeadorServicioAplicacion implements MapeadorAplicacion<ServicioDto, ServicioPaquete> {

    @Autowired
    private RepositorioServicioPaquete repositorioServicioPaquete;


    @Override
    public ServicioPaquete aDominio(ServicioDto dto) {
        return ServicioPaquete.nuevoServicioPaqueteConIdentificador(dto.getIdentificador(), dto.getNombreSolicitante(),
                dto.getNumeroIdentificacion(), dto.getCodigoIdentificador(), dto.getTipoIdentificacion(),
                dto.getIdentificadorEstadoServicio(), dto.getNombreEstado(), dto.getUbicacionIdentificador(),
                dto.getLatitudServicio(), dto.getLongitudServicio(), dto.getDetalleAdicionalServicio(),
                dto.getIdentificadorDestino(), dto.getNombreDestinatario(), dto.getIdentificacionDestinatario(), dto.getCodigoMoneda(),
                dto.getCostoInicialSolicitante(), dto.getIdentificadorMoneda());
    }
}
