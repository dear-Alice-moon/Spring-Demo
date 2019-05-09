package com.moon.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.jdbc.dao.impl.StudentJDBCTemplate2;
import com.moon.jdbc.pojo.Student;
import com.moon.jdbc.pojo.Student2;
import com.moon.jdbc.pojo.Student3;

public class MainApp2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		StudentJDBCTemplate2 studentJDBCTemplate2 = (StudentJDBCTemplate2) context.getBean("studentJDBCTemplate2");
		
		System.out.println("-------------- selectStudent(..)函数，使用JDBCTemplate查询返回实体类  --------------");
		Student3 stu3 = studentJDBCTemplate2.selectStudent(1011);  // 为1011的"id"必须存在，否则报错. 
		System.out.println("stu3为：" + stu3.toString());
		
		System.out.println("-------------- selectStudent2(..)函数，使用JDBCTemplate查询返回实体类  --------------");
		List<Student2> stuList = studentJDBCTemplate2.selectStudent2(1011);
		System.out.println("stuList为：" + stuList.toString());
		
		
		System.out.println("-------------- 调用 getRecord1存储过程  --------------");
		Student stu = studentJDBCTemplate2.getStudent(1011);
		System.out.println("stu为：" + stu.toString());
		
		System.out.println("-------------- 调用 getRecord2存储过程  --------------");
		Student stu2 = studentJDBCTemplate2.getStudent2("李", 2);
		System.out.println("stu为：" + stu2.toString());
		
	}
	
}
