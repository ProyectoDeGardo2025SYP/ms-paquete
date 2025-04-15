package co.edu.uco.burstcar.paquete.aplicacion.mapeador.peso.impl;

import co.edu.uco.burstcar.paquete.aplicacion.casodeuso.peso.comando.dto.PesoDto;
import co.edu.uco.burstcar.paquete.aplicacion.mapeador.MapeadorAplicacion;
import co.edu.uco.burstcar.paquete.dominio.modelo.Contenido;
import co.edu.uco.burstcar.paquete.dominio.modelo.MedidaPaquete;
import co.edu.uco.burstcar.paquete.dominio.modelo.Peso;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioContenido;
import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioMedidaPaquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapeadorPesoAplicacion implements MapeadorAplicacion<PesoDto, Peso> {

    @Autowired
    private RepositorioContenido repositorioContenido;
    @Autowired
    private RepositorioMedidaPaquete repositorioMedidaPaquete;

    @Override
    public Peso aDominio(PesoDto dto) {
        Contenido contenido = this.repositorioContenido.consultarContenido(dto.getContenidoId());
        MedidaPaquete medidaPaquete = this.repositorioMedidaPaquete.asociarMedidaPaquete(dto.getNombreMedida());
        return Peso.nuevoPeso(dto.getValor(), contenido, medidaPaquete);
    }
}
