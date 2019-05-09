package com.moon.java.configuration;

public class HelloWorld {
	
	private String message;
	
	private Integer num;
	
	
	
	/**
	 * 重写 toString() 函数     
	 */
	@Override
	public String toString() {
		return "HelloWorld [message=" + message + ", num=" + num + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param message
	 * @param num
	 */
	public HelloWorld(String message, Integer num) {
		super();
		this.message = message;
		this.num = num;
	}
	
	/**
	 * 无参构造函数
	 */
	public HelloWorld() {
		super();
	}
	
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
}
