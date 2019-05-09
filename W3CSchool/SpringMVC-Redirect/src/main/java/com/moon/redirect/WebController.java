package com.moon.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class WebController {
	
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "index";  // 转发到"index.jsp"页面    2019/01/08  16:05   
	}
	
	@RequestMapping(value="/redirect", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:finalPage";  // 重定向到 "finalPage()"函数    2019/01/08  16:05      
	}
	
	@RequestMapping(value="/finalPage", method = RequestMethod.GET)
	public String finalPage() {
		return "final";
	}
	
	
}
