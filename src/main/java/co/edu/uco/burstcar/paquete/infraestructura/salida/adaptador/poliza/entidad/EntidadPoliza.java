package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.poliza.entidad;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.EntidadIdentificador;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.entidad.EntidadMonedaPaquete;
import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.paquete.entidad.EntidadPaquete;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "poliza", schema = "paquete")
public class EntidadPoliza extends EntidadIdentificador {

    @Column
    private Boolean asegurado;

    @Column
    private Double valor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "moneda_paquete_id")
    private EntidadMonedaPaquete entidadMonedaPaquete;

    @OneToMany
    @JoinTable(
            name = "poliza_paquete",
            joinColumns = @JoinColumn(name = "poliza_id"),
            inverseJoinColumns = @JoinColumn(name = "paquete_id"))
    private List<EntidadPaquete> paquetes;


    public EntidadPoliza() {
    }

    public EntidadPoliza(Boolean asegurado, Double valor, EntidadMonedaPaquete entidadMonedaPaquete, ArrayList<EntidadPaquete> paquetes) {
        this.asegurado = asegurado;
        this.valor = valor;
        this.entidadMonedaPaquete = entidadMonedaPaquete;
        this.paquetes = paquetes;
    }
}
