package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.entidad;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.EntidadIdentificador;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.entidad.EntidadContenido;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.serviciopaquete.entidad.EntidadServicioPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.tipopaquete.entidad.EntidadTipoPaquete;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "paquete", schema = "paquete")
public class EntidadPaquete extends EntidadIdentificador {

    @Column(length = 150)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_paquete_id")
    private EntidadTipoPaquete entidadTipoPaquete;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contenido_id")
    private EntidadContenido entidadContenido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servicio_paquete_id")
    private EntidadServicioPaquete entidadServicioPaquete;

    public EntidadPaquete(String descripcion, EntidadTipoPaquete entidadTipoPaquete, EntidadContenido entidadContenido, EntidadServicioPaquete entidadServicioPaquete) {
        this.descripcion = descripcion;
        this.entidadTipoPaquete = entidadTipoPaquete;
        this.entidadContenido = entidadContenido;
        this.entidadServicioPaquete = entidadServicioPaquete;
    }

    public EntidadPaquete() {
    }
}
