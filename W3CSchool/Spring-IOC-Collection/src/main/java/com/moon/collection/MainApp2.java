package com.moon.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		
		System.out.println("JavaCollection.java中的值为：" + jc.toString());
		System.out.println("-------------------------------");
		System.out.println("addressList为：" + jc.getAddressList().toString());
		System.out.println("addressSet为：" + jc.getAddressSet().toString());
		System.out.println("addressMap为：" + jc.getAddressMap().toString());
		System.out.println("addressProp为：" + jc.getAddressProp().toString());
		
		// 备注：以上程序可正确运行。   2018/12/02  11:06
	}
	
	
}
