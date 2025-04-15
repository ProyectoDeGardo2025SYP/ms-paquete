package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.monedapaquete.entidad;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.EntidadIdentificador;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "moneda_paquete", schema = "paquete")
public class EntidadMonedaPaquete extends EntidadIdentificador {

    @Column(length = 30)
    private String nombreMoneda;

    @Column(length = 3)
    private String codigoMoneda;
}
