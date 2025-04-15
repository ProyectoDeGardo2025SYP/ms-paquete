package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.medidapaquete.entidad;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.EntidadIdentificador;
import jakarta.persistence.*;

import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "medida_paquete", schema = "paquete")
public class EntidadMedidaPaquete extends EntidadIdentificador {

    @Column(length = 15)
    private String nombreMedida;

    @Column(length = 3)
    private String abreviaturaMedida;

    @Column
    private UUID identificadorTipoUnidad;

    @Column(length = 10)
    private String nombreTipoUnidadMetrica;

}
