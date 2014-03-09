package org.techiekernel.java.config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.techiekernel.java.config.service.HelloWorldService;

@Configuration
public class HelloConfig {

	@Bean(name = "helloWorldBean")
	public HelloWorldService helloWorldService() {
		return new HelloWorldService();
	}

}
