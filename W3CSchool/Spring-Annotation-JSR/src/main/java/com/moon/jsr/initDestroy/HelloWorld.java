package com.moon.jsr.initDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	
	private String message;
	
	private Integer number;
	
	
	/**
	 * 在Beans.xml中， bean节点配置中 'init-method' 参数配置指定了该方法。
	 */
	@PostConstruct
	public void init() {
		System.out.println("Bean is going through init.");
	}
	
	/**
	 * 在Beans.xml中，bean节点配置中 'destroy-method' 参数配置指定了该方法。
	 */
	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "HelloWorld [message=" + message + ", number=" + number + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param message
	 * @param number
	 */
	public HelloWorld(String message, Integer number) {
		super();
		this.message = message;
		this.number = number;
	}
	
	/**
	 * 无参构造函数
	 */
	public HelloWorld() {
		super();
	}
	
	
	
	public String getMessage() {
		System.out.println("Your Message: " + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
}
