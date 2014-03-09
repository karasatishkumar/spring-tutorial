package org.techiekernel.java.config.service;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorldService {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello(String name) {
		return "Hello from HelloWorld Service! " + name;
	}

}
