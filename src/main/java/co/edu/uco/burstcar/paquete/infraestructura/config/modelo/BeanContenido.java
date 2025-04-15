package co.edu.uco.burstcar.paquete.infraestructura.config.modelo;

import co.edu.uco.burstcar.paquete.dominio.puerto.RepositorioContenido;
import co.edu.uco.burstcar.paquete.dominio.servicio.contenido.ServicioRegistrarContenido;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanContenido {

    @Bean
    public ServicioRegistrarContenido servicioRegistrarContenido(RepositorioContenido repositorioContenido){
        return new ServicioRegistrarContenido(repositorioContenido);
    }
}
