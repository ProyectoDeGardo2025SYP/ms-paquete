package co.edu.uco.burstcar.paquete.aplicacion.casodeuso.poliza.comando.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class PaqueteDto {
    private UUID identificadorPaquete;

    public PaqueteDto(UUID identificadorPaquete) {
        this.identificadorPaquete = identificadorPaquete;
    }
}
