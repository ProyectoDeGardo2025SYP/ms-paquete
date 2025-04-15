package co.edu.uco.burstcar.paquete.aplicacion.mapeador.poliza.impl;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.poliza.comando.dto.PolizaDto;
import co.edu.uco.burstcar.paquete.aplicacion.mapeador.MapeadorAplicacion;
import co.edu.uco.burstcar.paquete.dominio.modelo.*;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioMonedaPaquete;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPaquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class MapeadorPolizaAplicacion implements MapeadorAplicacion<PolizaDto, Poliza> {

    @Autowired
    private RepositorioMonedaPaquete repositorioMonedaPaquete;
    @Autowired
    private RepositorioPaquete repositorioPaquete;


    @Override
    public Poliza aDominio(PolizaDto dto) {
        ArrayList<Paquete> paquetes = dto.getIdentificadorPaquetes().stream()
                .map(paqueteDto -> this.repositorioPaquete.consultarContenido(paqueteDto.getIdentificadorPaquete()))
                .collect(Collectors.toCollection(ArrayList::new));

        return Poliza.nuevaPoliza(dto.getAsegurado(), dto.getValor(),
                this.repositorioMonedaPaquete.asociarMonedaPaquete(dto.getAbreviaturaMoneda()),
                paquetes);
    }
}
