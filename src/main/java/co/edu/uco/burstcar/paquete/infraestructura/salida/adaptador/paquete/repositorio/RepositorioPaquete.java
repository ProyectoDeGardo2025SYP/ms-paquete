package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.repositorio;

import co.edu.uco.burstcar.paquete.dominio.modelo.*;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.entidad.EntidadContenido;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.repositorio.jpa.RepositoryContenidoJpa;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.entidad.EntidadPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.repositorio.jpa.RepositorioPaqueteJpa;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.serviciopaquete.entidad.EntidadServicioPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.serviciopaquete.repositorio.jpa.RepositorioServicioPaqueteJpa;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.tipopaquete.entidad.EntidadTipoPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.tipopaquete.repositorio.jpa.RepositorioTipoPaqueteJpa;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public class RepositorioPaquete implements co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPaquete {

    private final RepositorioPaqueteJpa repositorioPaqueteJpa;
    private final RepositoryContenidoJpa repositoryContenidoJpa;
    private final RepositorioTipoPaqueteJpa repositorioTipoPaqueteJpa;
    private final RepositorioServicioPaqueteJpa repositorioServicioPaqueteJpa;

    public RepositorioPaquete(RepositorioPaqueteJpa repositorioPaqueteJpa,
                              RepositoryContenidoJpa repositoryContenidoJpa,
                              RepositorioTipoPaqueteJpa repositorioTipoPaqueteJpa, RepositorioServicioPaqueteJpa repositorioServicioPaqueteJpa) {
        this.repositorioPaqueteJpa = repositorioPaqueteJpa;
        this.repositoryContenidoJpa = repositoryContenidoJpa;
        this.repositorioTipoPaqueteJpa = repositorioTipoPaqueteJpa;
        this.repositorioServicioPaqueteJpa = repositorioServicioPaqueteJpa;
    }
    @Override
    public UUID registrarInformacionNuevoPaquete(Paquete paquete) {
        EntidadTipoPaquete entidadTipoPaquete = this.repositorioTipoPaqueteJpa.findByNombre(paquete.getTipoPaquete().getNombre());
        EntidadContenido entidadContenido = this.repositoryContenidoJpa.findById(paquete.getContenido().getIdentificador()).orElse(null);
        EntidadServicioPaquete entidadServicioPaquete = this.repositorioServicioPaqueteJpa.findById(paquete.getServicioPaquete().getIdentificador()).orElse(null);

        EntidadPaquete entidadPaquete = new EntidadPaquete(paquete.getDescripcion(),
                entidadTipoPaquete, entidadContenido, entidadServicioPaquete);

        entidadPaquete.setIdentificador(paquete.getIdentificador());
        return this.repositorioPaqueteJpa.save(entidadPaquete).getIdentificador();
    }

    @Override
    public void actualizarInformacionPaquete(Paquete paquete) {

    }

    @Override
    public Paquete consultarContenido(UUID identificador) {
        EntidadPaquete entidadPaquete = this.repositorioPaqueteJpa.findById(identificador).orElse(null);

        assert entidadPaquete != null;
        EntidadTipoPaquete entidadTipoPaquete = this.repositorioTipoPaqueteJpa.findByNombre(entidadPaquete.getEntidadTipoPaquete().getNombre());
        TipoPaquete tipoPaquete = TipoPaquete.nuevoTipoPaqueteConIdentificador(
                entidadTipoPaquete.getIdentificador(), entidadTipoPaquete.getDescripcion(), entidadTipoPaquete.getNombre());

        EntidadContenido entidadContenido = this.repositoryContenidoJpa.findById(entidadPaquete.getEntidadContenido().getIdentificador()).orElse(null);
        assert entidadContenido != null;
        MonedaPaquete monedaPaquete = MonedaPaquete.nuevaMonedaPaqueteConIdentificador(entidadContenido.getEntidadMonedaPaquete().getIdentificador(), entidadContenido.getEntidadMonedaPaquete().getNombreMoneda(), entidadContenido.getEntidadMonedaPaquete().getCodigoMoneda());
        Contenido contenido = Contenido.nuevoContenidoConIdentificador(entidadContenido.getIdentificador(),
                entidadContenido.getDescripcion(), entidadContenido.getFragil(), entidadContenido.getValorAproximado(), monedaPaquete);

        EntidadServicioPaquete entidadServicioPaquete = this.repositorioServicioPaqueteJpa.findById(entidadPaquete.getEntidadServicioPaquete().getIdentificador()).orElse(null);
        assert entidadServicioPaquete != null;
        ServicioPaquete servicioPaquete = ServicioPaquete.nuevoServicioPaqueteConIdentificador(
                entidadServicioPaquete.getIdentificador(), entidadServicioPaquete.getNombreSolicitante(),
                entidadServicioPaquete.getNumeroIdentificacion(), entidadServicioPaquete.getCodigoIdentificador(),
                entidadServicioPaquete.getTipoIdentificacion(), entidadServicioPaquete.getIdentificadorEstadoServicio(),
                entidadServicioPaquete.getNombreEstado(), entidadServicioPaquete.getUbicacionIdentificador(),
                entidadServicioPaquete.getLatitudServicio(), entidadServicioPaquete.getLongitudServicio(), entidadServicioPaquete.getDetalleAdicionalServicio(),
                entidadServicioPaquete.getIdentificadorDestino(), entidadServicioPaquete.getNombreDestinatario(),
                entidadServicioPaquete.getIdentificacionDestinatario(), entidadServicioPaquete.getCodigoMoneda(),
                entidadServicioPaquete.getCostoInicialSolicitante(), entidadServicioPaquete.getIdentificadorMoneda());

        return Paquete.nuevoPaqueteConIdentificador(entidadPaquete.getIdentificador(), entidadPaquete.getDescripcion(), tipoPaquete, contenido, servicioPaquete);
    }

}
