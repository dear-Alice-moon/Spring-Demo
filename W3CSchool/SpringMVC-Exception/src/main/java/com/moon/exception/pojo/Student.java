package com.moon.exception.pojo;

public class Student {
	
	private Integer id;
	// 测试字段      
	private Integer idd;
	
	private String name;
	
	private Integer age;
	
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", idd=" + idd + ", name=" + name + ", age=" + age + "]";
	}
	
	
	/*
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	*/
	
	/**
	 * 全参构造函数
	 * @param id
	 * @param name
	 * @param age
	 */
	public Student(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

	/**
	 * 无参构造函数
	 */
	public Student() {
		super();
	}
	
	
	
	
	
	public Integer getIdd() {
		return idd;
	}

	public void setIdd(Integer idd) {
		this.idd = idd;
	}
	
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
