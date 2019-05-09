package com.moon.beanpostprocessor;

public class HelloWorld {
	
	private String message;
	
	
	
	
	/**
	 * 初始化 Bean
	 */
	public void init() {
		System.out.println("Spring-BeanPostProcessor 中 Bean is going through init.");
	}
	
	/**
	 * 销毁 Bean
	 */
	public void destroy() {
		System.out.println("Spring-BeanPostProcessor 中 Bean will destroy now.");
	}
	
	// 重写toString()函数
	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
	// 全参构造函数
	public HelloWorld(String message) {
		super();
		this.message = message;
	}
	
	// 无参构造函数
	public HelloWorld() {
		super();
	}
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
