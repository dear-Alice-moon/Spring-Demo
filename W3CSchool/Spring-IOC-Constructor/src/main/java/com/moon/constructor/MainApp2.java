package com.moon.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		
		MultiEntity objA = (MultiEntity) context.getBean("multiEntity");
		objA.speck();
		System.out.println("objA为：" + objA.toString());
		System.out.println("---------------------------------------");
		
		
		MultiEntity objB = (MultiEntity) context.getBean("multiEntity2");
		objB.speck();
		System.out.println("objB为：" + objB.toString());
		
	}
	
	
}
