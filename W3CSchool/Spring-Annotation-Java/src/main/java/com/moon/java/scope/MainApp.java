package com.moon.java.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student stu1 = context.getBean(Student.class);
		Student stu2 = context.getBean(Student.class);
		
		stu1.setName("张三");
		System.out.println("stu1的值为：" + stu1.toString());
		System.out.println("-------------------------------------");
		stu2.setAddress("东胜神洲-傲来国-花果山");
		System.out.println("stu2的值为：" + stu2.toString());
		
		
	}
	
}
