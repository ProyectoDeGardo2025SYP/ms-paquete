package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.tipopaquete.repositorio;

import co.edu.uco.burstcar.paquete.dominio.modelo.TipoPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.tipopaquete.repositorio.jpa.RepositorioTipoPaqueteJpa;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.tipopaquete.entidad.EntidadTipoPaquete;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioTipoPaquete implements co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioTipoPaquete {

    private final RepositorioTipoPaqueteJpa repositorioTipoPaqueteJpa;
    public RepositorioTipoPaquete(RepositorioTipoPaqueteJpa repositorioTipoPaqueteJpa) {
        this.repositorioTipoPaqueteJpa = repositorioTipoPaqueteJpa;
    }
    @Override
    public TipoPaquete asociarMonedaPaquete(String nombre) {
        EntidadTipoPaquete entidadTipoPaquete = this.repositorioTipoPaqueteJpa.findByNombre(nombre);
        if(entidadTipoPaquete == null){
            return null;
        }
        return TipoPaquete.nuevoTipoPaqueteConIdentificador(
                entidadTipoPaquete.getIdentificador(),
                entidadTipoPaquete.getDescripcion(), entidadTipoPaquete.getNombre());
    }

    @Override
    public List<TipoPaquete> consultarMonedasPaquete() {
        final List<EntidadTipoPaquete> entidadTipoPaquetes = repositorioTipoPaqueteJpa.findAll(Sort.by("identificador"));
        return entidadTipoPaquetes.stream()
                .map(tipoPaquete -> mapeo(tipoPaquete))
                .toList();
    }

    private TipoPaquete mapeo(EntidadTipoPaquete entidadTipoPaquete) {
        return TipoPaquete.nuevoTipoPaqueteConIdentificador(entidadTipoPaquete.getIdentificador(), entidadTipoPaquete.getDescripcion(),
                entidadTipoPaquete.getNombre());
    }
}
