package com.moon.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		// 正常情况下配置的Beans.xml文件
		// ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");  
		
		// 使用自动配置"byName"进行XML配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");  
		
		
		TextEditor te = (TextEditor) context.getBean("textEditor");
		
		te.spellCheck();
		
	}
	
	
}
