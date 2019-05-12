package com.wwjswly.learn.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class RabbitMQConfig {
    @Bean
    public Queue queue() {
        return new Queue("queue", true);
    }

}
