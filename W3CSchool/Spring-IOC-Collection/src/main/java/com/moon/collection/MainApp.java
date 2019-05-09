package com.moon.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		
		System.out.println("JavaCollection.java中的值为：" + jc.toString());
		System.out.println("-------------------------------");
		System.out.println("addressList为：" + jc.getAddressList().toString());
		System.out.println("addressSet为：" + jc.getAddressSet().toString());
		System.out.println("addressMap为：" + jc.getAddressMap().toString());
		System.out.println("addressProp为：" + jc.getAddressProp().toString());
		
		
	}
	
	
}
