package co.edu.uco.burstcar.paquete.infraestructura.config.modelo;

import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPaquete;
import co.edu.uco.burstcar.paquete.dominio.servicio.paquete.ServicioActualizarPaquete;
import co.edu.uco.burstcar.paquete.dominio.servicio.paquete.ServicioConsultarPaquete;
import co.edu.uco.burstcar.paquete.dominio.servicio.paquete.ServicioConsultarPaquetePorServicio;
import co.edu.uco.burstcar.paquete.dominio.servicio.paquete.ServicioRegistrarPaquete;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanPaquete {

    @Bean
    public ServicioRegistrarPaquete servicioRegistrarPaquete(RepositorioPaquete repositorioPaquete){
        return new ServicioRegistrarPaquete(repositorioPaquete);
    }

    @Bean
    public ServicioActualizarPaquete servicioActualizarPaquete(RepositorioPaquete repositorioPaquete){
        return new ServicioActualizarPaquete(repositorioPaquete);
    }

    @Bean
    public ServicioConsultarPaquete servicioConsultarPaquete(RepositorioPaquete repositorioPaquete){
        return new ServicioConsultarPaquete(repositorioPaquete);
    }

    @Bean
    public ServicioConsultarPaquetePorServicio servicioConsultarPaquetePorServicio(RepositorioPaquete repositorioPaquete){
        return new ServicioConsultarPaquetePorServicio(repositorioPaquete);
    }
}
