package co.edu.uco.burstcar.paquete.aplicacion.mapeador.servicio.impl;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.paquete.comando.dto.PaqueteDto;
import co.edu.uco.burstcar.paquete.aplicacion.mapeador.MapeadorAplicacion;
import co.edu.uco.burstcar.paquete.dominio.modelo.*;
import co.edu.uco.burstcar.paquete.dominio.puerto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapeadorPaqueteAplicacion implements MapeadorAplicacion<PaqueteDto, Paquete> {

    @Autowired
    private RepositorioPaquete repositorioPaquete;
    @Autowired
    private RepositorioTipoPaquete repositorioTipoPaquete;
    @Autowired
    private RepositorioContenido repositorioContenido;
    @Autowired
    private RepositorioServicioPaquete repositorioServicioPaquete;

    @Override
    public Paquete aDominio(PaqueteDto dto) {
        TipoPaquete tipoPaquete = this.repositorioTipoPaquete.asociarMonedaPaquete(dto.getTipoPaqueteNombre());
        Contenido contenido = this.repositorioContenido.consultarContenido(dto.getContenido());
        ServicioPaquete servicioPaquete = this.repositorioServicioPaquete.asociarServicioPaquete(dto.getServicioPaquete());

        return Paquete.nuevoPaquete(dto.getDescripcion(), tipoPaquete, contenido, servicioPaquete);
    }
}
