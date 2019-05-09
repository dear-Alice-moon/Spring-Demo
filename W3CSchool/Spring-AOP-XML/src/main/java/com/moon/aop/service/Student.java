package com.moon.aop.service;

public class Student {
	
	private String name;
	
	private Integer age;
	
	
	/**
	 * 
	 */
	public String printHello() {
		return "今年是狗年，明年是猪年.";
	}
	
	
	/**
	 * 测试'异常通知'
	 */
	public void printThrowException() {
		System.out.println("Student.java文件中，printThrowException()函数， Exception raised......");
		// throw new IllegalArgumentException();
	}
	
	
	
	/**
	 * 重写 toString() 函数
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param name
	 * @param age
	 */
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 无参构造函数
	 */
	public Student() {
		super();
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
