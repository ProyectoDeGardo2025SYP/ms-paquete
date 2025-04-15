package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.poliza.repositorio;

import co.edu.uco.burstcar.paquete.dominio.modelo.Poliza;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.entidad.EntidadMonedaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.repositorio.jpa.RepositorioMonedaPaqueteJpa;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.entidad.EntidadPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.repositorio.jpa.RepositorioPaqueteJpa;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.poliza.entidad.EntidadPoliza;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.poliza.repositorio.jpa.RepositorioPolizaJpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;


@Repository
public class RepositorioPoliza implements co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPoliza {

    private final RepositorioPolizaJpa repositorioPolizaJpa;
    private final RepositorioMonedaPaqueteJpa repositorioMonedaPaqueteJpa;
    private final RepositorioPaqueteJpa repositorioPaqueteJpa;

    public RepositorioPoliza(RepositorioPolizaJpa repositorioPolizaJpa, RepositorioMonedaPaqueteJpa repositorioMonedaPaqueteJpa, RepositorioPaqueteJpa repositorioPaqueteJpa) {
        this.repositorioPolizaJpa = repositorioPolizaJpa;
        this.repositorioMonedaPaqueteJpa = repositorioMonedaPaqueteJpa;
        this.repositorioPaqueteJpa = repositorioPaqueteJpa;
    }


    @Override
    public UUID solicitarPolizasSeguroPaquetes(Poliza poliza) {
        EntidadMonedaPaquete entidadMonedaPaquete = this.repositorioMonedaPaqueteJpa.findByNombre(poliza.getMonedaPaquete().getCodigoMoneda());

        ArrayList<EntidadPaquete> entidadPaquetes = poliza.getPaquetes().stream()
                .map(paquete -> this.repositorioPaqueteJpa.findById(paquete.getIdentificador())
                        .orElseThrow(() -> new RuntimeException("Paquete no encontrado: " + paquete.getIdentificador())))
                .collect(Collectors.toCollection(ArrayList::new));

        EntidadPoliza entidadPoliza = new EntidadPoliza(poliza.getAsegurado(), poliza.getValor(),
                entidadMonedaPaquete, entidadPaquetes);
        entidadPoliza.setIdentificador(poliza.getIdentificador());
        return this.repositorioPolizaJpa.save(entidadPoliza).getIdentificador();
    }

    @Override
    public Poliza consultarPoliza(UUID identificador) {
        return null;
    }
}
