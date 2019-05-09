package com.moon.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		HelloUser helloUser = (HelloUser) context.getBean("helloUser");
		System.out.println("helloUser运行流程为：" + helloUser.toString());
		
		System.out.println("============================================");
		
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		System.out.println("helloWorld运行流程为：" + helloWorld.toString());
		
		System.out.println("---------------------------------------------");
		
		
		context.registerShutdownHook();
	}
	
	
}
