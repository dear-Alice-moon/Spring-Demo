package com.moon.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		
		System.out.println("objA为：" + objA);  // 返回： Hello World! 2018/11/21 16:16
		
		context.registerShutdownHook();
	}
	
	
}
