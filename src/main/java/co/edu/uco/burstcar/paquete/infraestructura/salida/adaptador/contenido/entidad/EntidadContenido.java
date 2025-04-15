package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.contenido.entidad;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.EntidadIdentificador;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.entidad.EntidadMonedaPaquete;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "contenido", schema = "paquete")
public class EntidadContenido extends EntidadIdentificador {

    @Column(length = 15)
    private String descripcion;

    @Column
    private Boolean fragil;

    @Column
    private Double valorAproximado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "moneda_paquete_id")
    private EntidadMonedaPaquete entidadMonedaPaquete;

    public EntidadContenido() {
    }

    public EntidadContenido(String descripcion, Boolean fragil, Double valorAproximado, EntidadMonedaPaquete entidadMonedaPaquete) {
        this.descripcion = descripcion;
        this.fragil = fragil;
        this.valorAproximado = valorAproximado;
        this.entidadMonedaPaquete = entidadMonedaPaquete;
    }
}
