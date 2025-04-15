package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.repositorio;

import co.edu.uco.burstcar.paquete.dominio.modelo.MedidaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.entidad.EntidadMedidaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.repositorio.jpa.RepositorioMedidaPaqueteJpa;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;


@Repository
public class RepositorioMedidaPaquete implements co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioMedidaPaquete {

    private final RepositorioMedidaPaqueteJpa repositorioMedidaPaqueteJpa;
    public RepositorioMedidaPaquete(RepositorioMedidaPaqueteJpa repositorioMedidaPaqueteJpa) {
        this.repositorioMedidaPaqueteJpa = repositorioMedidaPaqueteJpa;
    }

    @Override
    public MedidaPaquete asociarMedidaPaquete(String nombre) {
        EntidadMedidaPaquete entidadMedidaPaquete = this.repositorioMedidaPaqueteJpa.findByAbreviatura(nombre);
        if(entidadMedidaPaquete == null){
            return null;
        }
        return MedidaPaquete.nuevaMedidaConIdentificador(entidadMedidaPaquete.getIdentificador(), entidadMedidaPaquete.getNombreMedida(),
                entidadMedidaPaquete.getAbreviaturaMedida(), entidadMedidaPaquete.getIdentificadorTipoUnidad(),
                entidadMedidaPaquete.getNombreTipoUnidadMetrica());
    }

    @Override
    public List<MedidaPaquete> consultarMonedasPaquete() {
        final List<EntidadMedidaPaquete> entidadMedidaPaquetes = repositorioMedidaPaqueteJpa.findAll(Sort.by("identificador"));
        return entidadMedidaPaquetes.stream()
                .map(this::mapeo)
                .toList();
    }

    private MedidaPaquete mapeo(EntidadMedidaPaquete entidadMedidaPaquete) {
        return MedidaPaquete.nuevaMedidaConIdentificador(entidadMedidaPaquete.getIdentificador(),
                entidadMedidaPaquete.getNombreMedida(), entidadMedidaPaquete.getAbreviaturaMedida(),
                entidadMedidaPaquete.getIdentificadorTipoUnidad(), entidadMedidaPaquete.getNombreTipoUnidadMetrica());
    }
}
