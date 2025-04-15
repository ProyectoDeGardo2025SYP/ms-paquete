package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.repositorio;

import co.edu.uco.burstcar.paquete.dominio.modelo.MonedaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.entidad.EntidadMonedaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.repositorio.jpa.RepositorioMonedaPaqueteJpa;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;


@Repository
public class RepositorioMonedaPaquete implements co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioMonedaPaquete {

    private final RepositorioMonedaPaqueteJpa repositorioMonedaPaqueteJpa;

    public RepositorioMonedaPaquete(RepositorioMonedaPaqueteJpa repositorioMonedaPaqueteJpa) {
        this.repositorioMonedaPaqueteJpa = repositorioMonedaPaqueteJpa;
    }

    @Override
    public MonedaPaquete asociarMonedaPaquete(String nombre) {
        EntidadMonedaPaquete entidadMonedaPaquete = this.repositorioMonedaPaqueteJpa.findByNombre(nombre);
        if(entidadMonedaPaquete == null){
            return null;
        }
        return MonedaPaquete.nuevaMonedaPaqueteConIdentificador(
                entidadMonedaPaquete.getIdentificador(),
                entidadMonedaPaquete.getNombreMoneda(), entidadMonedaPaquete.getCodigoMoneda());
    }

    @Override
    public List<MonedaPaquete> consultarMonedasPaquete() {
        final List<EntidadMonedaPaquete> entidadMonedaPaquetes = repositorioMonedaPaqueteJpa.findAll(Sort.by("identificador"));
        return entidadMonedaPaquetes.stream()
                .map(this::mapeo)
                .toList();
    }

    private MonedaPaquete mapeo(final EntidadMonedaPaquete entidadMonedaPaquete) {
        return MonedaPaquete.nuevaMonedaPaqueteConIdentificador(entidadMonedaPaquete.getIdentificador(), entidadMonedaPaquete.getNombreMoneda(),
                entidadMonedaPaquete.getCodigoMoneda());
    }
}
