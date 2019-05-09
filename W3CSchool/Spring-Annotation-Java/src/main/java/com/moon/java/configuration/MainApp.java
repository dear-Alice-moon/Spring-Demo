package com.moon.java.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 基于 Java 的配置
 * @Configuration 和 @Bean 注解
 * 
 */
public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		
		helloWorld.setMessage("你好，世界...");
		helloWorld.setNum(108);
		System.out.println("HelloWorld的值为：" + helloWorld.toString());
		
	}
	
}
