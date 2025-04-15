package co.edu.uco.burstcar.paquete.infraestructura.config.modelo;

import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPoliza;
import co.edu.uco.burstcar.paquete.dominio.servicio.poliza.ServicioSolicitarPoliza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanPoliza {

    @Bean
    public ServicioSolicitarPoliza servicioSolicitarPoliza(RepositorioPoliza repositorioPoliza){
        return new ServicioSolicitarPoliza(repositorioPoliza);
    }
}
