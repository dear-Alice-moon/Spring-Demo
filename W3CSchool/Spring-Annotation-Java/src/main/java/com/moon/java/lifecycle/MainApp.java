package com.moon.java.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld hello = context.getBean(HelloWorld.class);
		
		hello.setMessage("这是一个测试.....");
		System.out.println("--------------------------------");
		System.out.println("HelloWorld的值为：" + hello.toString());
		
	}
	
}
