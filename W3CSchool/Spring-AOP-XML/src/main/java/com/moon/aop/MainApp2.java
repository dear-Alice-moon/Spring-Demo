package com.moon.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.aop.log.Logging;

public class MainApp2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Logging logging = (Logging) context.getBean("logging");
		
		System.out.println("logging的值为： " + logging.toString());
		System.out.println("------------------------------------------------------------");
		
		logging.printHello();
		
	}
	
	
}
