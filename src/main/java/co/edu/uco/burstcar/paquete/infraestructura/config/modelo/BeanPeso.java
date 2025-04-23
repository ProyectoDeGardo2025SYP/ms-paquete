package co.edu.uco.burstcar.paquete.infraestructura.config.modelo;

import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioPeso;
import co.edu.uco.burstcar.paquete.dominio.servicio.peso.ServicioActualizarPeso;
import co.edu.uco.burstcar.paquete.dominio.servicio.peso.ServicioConsultarPeso;
import co.edu.uco.burstcar.paquete.dominio.servicio.peso.ServicioConsultarPesoPorContenido;
import co.edu.uco.burstcar.paquete.dominio.servicio.peso.ServicioRegistrarPeso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanPeso {

    @Bean
    public ServicioRegistrarPeso servicioRegistrarPeso(RepositorioPeso repositorioPeso){
        return new ServicioRegistrarPeso(repositorioPeso);
    }

    @Bean
    public ServicioActualizarPeso servicioActualizarPeso(RepositorioPeso repositorioPeso){
        return new ServicioActualizarPeso(repositorioPeso);
    }

    @Bean
    public ServicioConsultarPeso servicioConsultarPeso(RepositorioPeso repositorioPeso){
        return new ServicioConsultarPeso(repositorioPeso);
    }

    @Bean
    public ServicioConsultarPesoPorContenido servicioConsultarPesoPorContenido(RepositorioPeso repositorioPeso){
        return new ServicioConsultarPesoPorContenido(repositorioPeso);
    }
}
