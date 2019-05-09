package com.moon.event;

public class HelloWorld {
	
	private String message;
	
	private String name;
	
	private Integer age;
	
	
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "HelloWorld [message=" + message + ", name=" + name + ", age=" + age + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param message
	 * @param name
	 * @param age
	 */
	public HelloWorld(String message, String name, Integer age) {
		super();
		this.message = message;
		this.name = name;
		this.age = age;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
