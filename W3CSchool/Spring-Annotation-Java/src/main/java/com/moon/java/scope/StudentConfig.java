package com.moon.java.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentConfig {
	
	@Bean
	@Scope("singleton")  // singleton 作用域       
	// @Scope("prototype")  // prototype 作用域       
	public Student student() {
		return new Student();
	}
	
	
}
