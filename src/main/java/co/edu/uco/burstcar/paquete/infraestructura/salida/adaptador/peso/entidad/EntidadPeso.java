package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.peso.entidad;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.EntidadIdentificador;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.entidad.EntidadContenido;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.entidad.EntidadMedidaPaquete;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "peso", schema = "paquete")
public class EntidadPeso extends EntidadIdentificador {

    @Column
    private Double valor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contenido_id")
    private EntidadContenido entidadContenido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medida_paquete_id")
    private EntidadMedidaPaquete entidadMedidaPaquete;

    public EntidadPeso() {
    }

    public EntidadPeso(Double valor, EntidadContenido entidadContenido, EntidadMedidaPaquete entidadMedidaPaquete) {
        this.valor = valor;
        this.entidadContenido = entidadContenido;
        this.entidadMedidaPaquete = entidadMedidaPaquete;
    }
}
