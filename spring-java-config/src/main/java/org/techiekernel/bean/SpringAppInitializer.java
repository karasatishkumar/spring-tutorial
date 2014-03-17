package org.techiekernel.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringAppInitializer {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorld.class, Foo.class, Bar.class);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		System.out.println(helloWorld);
	}
}