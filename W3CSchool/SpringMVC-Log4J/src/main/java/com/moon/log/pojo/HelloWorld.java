package com.moon.log.pojo;

public class HelloWorld {
	
	private String message;
	
	
	
	/**
	 * 重写 toString()函数      
	 */
	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param message
	 */
	public HelloWorld(String message) {
		super();
		this.message = message;
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
	
}
