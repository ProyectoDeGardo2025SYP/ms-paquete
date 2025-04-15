package co.edu.uco.burstcar.paquete.infraestructura.config.modelo;

import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPaquete;
import co.edu.uco.burstcar.paquete.dominio.servicio.paquete.ServicioRegistrarPaquete;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanPaquete {

    @Bean
    public ServicioRegistrarPaquete servicioRegistrarPaquete(RepositorioPaquete repositorioPaquete){
        return new ServicioRegistrarPaquete(repositorioPaquete);
    }
}
