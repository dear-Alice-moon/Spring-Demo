package com.moon.java.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	
	@Bean(initMethod ="init", destroyMethod="cleanup")
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
	
	
	
}
