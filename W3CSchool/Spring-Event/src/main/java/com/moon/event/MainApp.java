package com.moon.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		// Let us raise a start Event.
		context.start();  // 开启事务
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.setMessage("这是一个测试......");
		System.out.println("obj值为: " + obj.toString());
		
		// Let us raise a stop event
		context.stop();  // 停止事务
		
	}
	
}
