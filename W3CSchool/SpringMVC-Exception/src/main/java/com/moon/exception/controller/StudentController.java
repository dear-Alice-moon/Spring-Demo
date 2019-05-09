package com.moon.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.moon.exception.exception.SpringException;
import com.moon.exception.pojo.Student;


@Controller
public class StudentController {
	
	@RequestMapping(value="/student", method = RequestMethod.GET)
	public ModelAndView student() {
		
		return new ModelAndView("student", "command", new Student());
	}
	
	
	@RequestMapping(value="/addStudent", method = RequestMethod.POST)
	@ExceptionHandler({SpringException.class})
	public String addStudent(@ModelAttribute("SpringMVC")Student student, ModelMap model){
	// public String addStudent(@ModelAttribute("SpringMVC-Exception")Student student, ModelMap map) {
		
		
		if (student.getName().length() < 5) {
			// 当进入到该异常时，根据 SpringMVC-Exception-test-servlet.xml文件配置，前台页面会跳转到"ExceptionPage.jsp"页面。
			throw new SpringException("Given name is too short");  
		} else {
			model.addAttribute("name", student.getName());
		}
		
		if (student.getAge() < 10) {
			throw new SpringException("Given age is too low");
		} else {
			model.addAttribute("age", student.getAge());
		}
		
		model.addAttribute("id", student.getId());
		
		model.addAttribute("idd", student.getIdd());
		
		System.out.println("addStudent()函数中，student值为：" + student.toString());
		
		// 当在这里设置抛出异常时，根据 SpringMVC-Exception-test-servlet.xml文件配置，前台页面会跳转到"error.jsp"页面。
		// throw new RuntimeException();  
		
		return "result";  // 运行正常，跳转到"result.jsp"页面
	}
	
	
	
	
}
