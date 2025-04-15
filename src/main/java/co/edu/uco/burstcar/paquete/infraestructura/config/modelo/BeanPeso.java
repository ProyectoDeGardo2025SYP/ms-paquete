package co.edu.uco.burstcar.paquete.infraestructura.config.modelo;

import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPeso;
import co.edu.uco.burstcar.paquete.dominio.servicio.peso.ServicioRegistrarPeso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanPeso {

    @Bean
    public ServicioRegistrarPeso servicioRegistrarPeso(RepositorioPeso repositorioPeso){
        return new ServicioRegistrarPeso(repositorioPeso);
    }
}
