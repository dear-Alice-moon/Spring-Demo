package com.moon.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		// 正常情况下配置的Beans.xml文件
		// ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");  
		
		// 使用自动配置"byName"进行XML配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");  
		
		
		// TextEditor2 te = (TextEditor2) context.getBean("textEditor");
		// TextEditor2 te = (TextEditor2) context.getBean("textEditor2");
		// TextEditor2 te = (TextEditor2) context.getBean("textEditor3");
		// TextEditor2 te = (TextEditor2) context.getBean("textEditor4");
		TextEditor2 te = (TextEditor2) context.getBean("textEditor5");
		
		te.spellCheck();
		System.out.println("-----------------------------");
		System.out.println("TextEditor.java中的值为：" + te.toString());
		
	}
	
	
}
