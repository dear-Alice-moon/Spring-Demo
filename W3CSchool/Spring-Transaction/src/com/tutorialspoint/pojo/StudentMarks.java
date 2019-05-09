package com.tutorialspoint.pojo;

public class StudentMarks {
	
	private Integer age;
	
	private String name;
	
	private Integer id;
	
	private Integer marks;
	
	private Integer year;
	
	private Integer sid;
	
	
	
	
	// 重写 toString() 函数
	@Override
	public String toString() {
		return "StudentMarks [age=" + age + ", name=" + name + ", id=" + id + ", marks=" + marks + ", year=" + year
				+ ", sid=" + sid + "]";
	}
	
	// 全参构造函数
	public StudentMarks(Integer age, String name, Integer id, Integer marks, Integer year, Integer sid) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.year = year;
		this.sid = sid;
	}
	
	// 无参构造函数
	public StudentMarks() {
		super();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
}
