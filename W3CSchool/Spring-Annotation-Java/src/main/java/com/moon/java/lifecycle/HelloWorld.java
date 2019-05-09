package com.moon.java.lifecycle;

public class HelloWorld {
	
	private String message;
	
	private Integer num;
	
	
	/**
	 * 用于实例化Bean，其初始化函数测试。
	 */
	public void init() {
		System.out.println("HelloWorld.java文件中，初始化函数测试......");
	}
	
	
	/**
	 * 用于实例化Bean，其清除函数测试。
	 */
	public void cleanup() {
		System.out.println("HelloWorld.java文件中，清除函数测试......");
	}
	
	
	
	
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
