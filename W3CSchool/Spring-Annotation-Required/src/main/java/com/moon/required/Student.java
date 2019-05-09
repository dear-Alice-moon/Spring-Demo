package com.moon.required;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private Integer age;
	
	private String name;
	
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param age
	 * @param name
	 */
	public Student(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	/**
	 * 无参构造函数
	 */
	public Student() {
		super();
	}
	
	
	
	public Integer getAge() {
		return age;
	}
	
	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
}
