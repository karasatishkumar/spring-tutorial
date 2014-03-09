package org.techiekernel.java.config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.techiekernel.java.config.service.HelloWorldService;

@Configuration
@Import({HelloConfig.class, GoodbyeConfig.class})
public class AppConfig {
	@Bean(name = "helloWorldBean")
	public HelloWorldService helloWorldService() {
		return new HelloWorldService();
	}
}
