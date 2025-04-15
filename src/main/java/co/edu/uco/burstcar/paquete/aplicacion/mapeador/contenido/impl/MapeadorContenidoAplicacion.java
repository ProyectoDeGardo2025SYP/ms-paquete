package co.edu.uco.burstcar.paquete.aplicacion.mapeador.contenido.impl;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.contenido.comando.dto.ContenidoDto;
import co.edu.uco.burstcar.paquete.aplicacion.mapeador.MapeadorAplicacion;
import co.edu.uco.burstcar.paquete.dominio.modelo.Contenido;
import co.edu.uco.burstcar.paquete.dominio.modelo.MonedaPaquete;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioMonedaPaquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapeadorContenidoAplicacion implements MapeadorAplicacion<ContenidoDto, Contenido> {

    @Autowired
    private RepositorioMonedaPaquete repositorioMonedaPaquete;

    @Override
    public Contenido aDominio(ContenidoDto dto) {
        MonedaPaquete monedaPaquete = this.repositorioMonedaPaquete.asociarMonedaPaquete(dto.getMonedaPaquete());
        return Contenido.nuevoContenido(dto.getDescripcion(),dto.getFragil(), dto.getValorAproximado(), monedaPaquete);
    }
}
