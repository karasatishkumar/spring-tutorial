package org.techiekernel.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppInitializer {
	
	public static void main(String[] args) {
		
		ApplicationContext springContext = new AnnotationConfigApplicationContext("org.techiekernel.bean");
		
		
		HelloWorld helloWorld = (HelloWorld)springContext.getBean(HelloWorld.class);
		
		System.out.println(helloWorld);
	}
}
