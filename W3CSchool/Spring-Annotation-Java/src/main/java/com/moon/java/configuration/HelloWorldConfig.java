package com.moon.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
	
	@Bean
	public Student student() {
		return new Student();
	}
	
}
