package com.moon.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.moon.form.pojo.Student;


@Controller
public class StudentController {
	
	@RequestMapping(value="/student", method = RequestMethod.GET)
	public ModelAndView student() {
		// 根据 ModelAndView(obj1,obj2,obj3)中的第一个参数"String viewName"，调用该方法将会返回 "student.jsp"页面
		return new ModelAndView("student", "command", new Student());
	}
	
	@RequestMapping(value="/student02", method = RequestMethod.GET)
	public ModelAndView student2() {
		// 根据 ModelAndView(obj1,obj2,obj3)中的第一个参数"String viewName"，调用该方法将会返回 "student02.jsp"页面
		return new ModelAndView("student02", "command", new Student());
	}
	
	
	
	// 在这里，若前台页面传递中文字符，后台model打印输出日志，会显示中文乱码。  2019/01/07  10:17                       
	@RequestMapping(value="/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model) {
		
		model.addAttribute("id", student.getId());
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		System.out.println("model内容为：" + model.toString());
		// model内容为：{SpringWeb=Student [id=1569, age=18, name=zhangsan], org.springframework.validation.BindingResult.SpringWeb=org.springframework.validation.BeanPropertyBindingResult: 0 errors, id=1569, name=zhangsan, age=18}
		// model内容中无"msg"属性，可推测在函数中 Student类与ModelMap相互映射。
				
		
		return "result";  // 转发到 "result.jsp" 页面    2019/01/07 9:57                          
	}
	
	@RequestMapping(value="/addStudent02", method = RequestMethod.POST)
	public String addStudent02(@ModelAttribute("SpringMVC-Form")Student student, ModelMap model) {
		
		model.addAttribute("msg", "测试数据...");  // 通过该行代码，可以推测到的是：ModelMap与Student成映射。Student类中没有的元素，则model添加其他元素也无用！
		model.addAttribute("id", student.getId());
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		System.out.println("-------------------------------------");
		System.out.println("model2内容为：" + model.toString());
		// model内容为：{SpringWeb=Student [id=1569, age=18, name=zhangsan], org.springframework.validation.BindingResult.SpringWeb=org.springframework.validation.BeanPropertyBindingResult: 0 errors, id=1569, name=zhangsan, age=18}
		// model内容中无"msg"属性，可推测在函数中 Student类与ModelMap相互映射。
		
		
		// return "result";
		return "result02";  // 转发到 "result02.jsp" 页面    2019/01/07 9:57    
	}
	
	
	
	
}
