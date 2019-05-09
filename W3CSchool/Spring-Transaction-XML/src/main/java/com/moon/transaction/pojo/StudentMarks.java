package com.moon.transaction.pojo;

public class StudentMarks {
	
	private Integer sid;
	
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Integer marks;
	
	private Integer year;
	
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "StudentMarks [sid=" + sid + ", id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks
				+ ", year=" + year + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param sid
	 * @param id
	 * @param name
	 * @param age
	 * @param marks
	 * @param year
	 */
	public StudentMarks(Integer sid, Integer id, String name, Integer age, Integer marks, Integer year) {
		super();
		this.sid = sid;
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.year = year;
	}
	
	/**
	 * 无参构造函数 
	 */
	public StudentMarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
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
	
}
