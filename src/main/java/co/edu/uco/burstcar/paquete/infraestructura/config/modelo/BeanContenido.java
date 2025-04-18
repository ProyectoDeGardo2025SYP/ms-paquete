package co.edu.uco.burstcar.paquete.infraestructura.config.modelo;

import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioContenido;
import co.edu.uco.burstcar.paquete.dominio.servicio.contenido.ServicioActualizarContenido;
import co.edu.uco.burstcar.paquete.dominio.servicio.contenido.ServicioRegistrarContenido;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanContenido {

    @Bean
    public ServicioRegistrarContenido servicioRegistrarContenido(RepositorioContenido repositorioContenido){
        return new ServicioRegistrarContenido(repositorioContenido);
    }

    @Bean
    public ServicioActualizarContenido servicioActualizarContenido(RepositorioContenido repositorioContenido){
        return new ServicioActualizarContenido(repositorioContenido);
    }
}
