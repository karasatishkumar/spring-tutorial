package org.techiekernel.java.config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.techiekernel.java.config.service.GoodbyeService;

@Configuration
public class GoodbyeConfig {
    @Bean(name="goodbyeBean")
    public GoodbyeService goodByeService() {
        return new GoodbyeService();
    }
}

