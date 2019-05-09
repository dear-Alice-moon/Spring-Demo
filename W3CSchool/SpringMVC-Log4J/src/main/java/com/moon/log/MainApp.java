package com.moon.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// import org.apache.logging.log4j.core.layout.PatternLayout;
// import org.apache.logging.log4j.core.appender.FileAppender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.log.pojo.HelloWorld;

/**
 * 本项目并未实现Log4j的功能，失败!
 * 待到以后能力提升，有空再来写一写。 
 * @author alice-moon  2019/01/10  15:05  
 *
 */
public class MainApp {
	
	// log4j-core.jar包的用法    2019/01/09  16:01             
	private static Logger log = LogManager.getLogger(MainApp.class.getName());
	
	// FileAppender
	// PatternLayout
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		log.info("Going to create HelloWord obj.");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println("obj值为：" + obj.toString());
		log.info("Exiting the program......");
	}
	
}
