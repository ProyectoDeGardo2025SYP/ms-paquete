package co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.tipopaquete.entidad;

import co.edu.uco.burstcar.paquete.infraestructura.salida.adaptador.EntidadIdentificador;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tipo_paquete", schema = "paquete")
public class EntidadTipoPaquete extends EntidadIdentificador {

    @Column(length = 100)
    private String descripcion;

    @Column(length = 15)
    private String nombre;

}
