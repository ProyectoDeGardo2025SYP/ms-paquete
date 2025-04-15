package co.edu.uco.burstcar.paquete.infraestructura.config.general.rabbit.serviciopaquete;


import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfiguracionServicioRabbit {

    private final PropiedadesConfiguracionServicioRabbit propiedadesConfiguracionServicioRabbit;

    public ConfiguracionServicioRabbit(PropiedadesConfiguracionServicioRabbit propiedadesConfiguracionServicioRabbit) {
        this.propiedadesConfiguracionServicioRabbit = propiedadesConfiguracionServicioRabbit;
    }

    @Bean
    public TopicExchange servicioExchange() {
        return new TopicExchange(propiedadesConfiguracionServicioRabbit.getExchange());
    }

    @Bean
    public Queue servicioCola() {
        return QueueBuilder.durable(propiedadesConfiguracionServicioRabbit.getCola())
                .withArgument("x-dead-letter-exchange", propiedadesConfiguracionServicioRabbit.getDlx())
                .withArgument("x-dead-letter-routing-key", propiedadesConfiguracionServicioRabbit.getDlq())
                .build();
    }

    @Bean
    public Binding servicioEnlace() {
        return BindingBuilder.bind(servicioCola())
                .to(servicioExchange())
                .with(propiedadesConfiguracionServicioRabbit.getClave());
    }

    @Bean
    public DirectExchange servcioDLX() {
        return new DirectExchange(propiedadesConfiguracionServicioRabbit.getDlx());
    }

    @Bean
    public Queue servicioDLQ() {
        return QueueBuilder.durable(propiedadesConfiguracionServicioRabbit.getDlq()).build();
    }

    @Bean
    public Binding servicioDlqEnlace() {
        return BindingBuilder.bind(servicioDLQ())
                .to(servcioDLX())
                .with(propiedadesConfiguracionServicioRabbit.getDlq());
    }
}
