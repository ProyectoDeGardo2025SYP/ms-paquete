package co.edu.uco.burstcar.paquete.infraestructura.config.modelo;

import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioServicioPaquete;
import co.edu.uco.burstcar.paquete.dominio.servicio.serviciopaquete.ServicioRegistrarServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanPaqueteServicio {

    @Bean
    public ServicioRegistrarServicio servicioRegistrarServicio(RepositorioServicioPaquete repositorioServicioPaquete){
        return new ServicioRegistrarServicio(repositorioServicioPaquete);
    }
}
