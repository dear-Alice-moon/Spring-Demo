package com.moon.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestCollection {
	
	private List addList;
	
	private Set addSet;
	
	private Map addMap;
	
	private Properties addProp;
	
	private String name;
	
	private Integer age;
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "TestCollection [addList=" + addList + ", addSet=" + addSet + ", addMap=" + addMap + ", addProp="
				+ addProp + ", name=" + name + ", age=" + age + "]";
	}
	
	
	/**
	 * 全参构造函数
	 * @param addList
	 * @param addSet
	 * @param addMap
	 * @param addProp
	 * @param name
	 * @param age
	 */
	public TestCollection(List addList, Set addSet, Map addMap, Properties addProp, String name, Integer age) {
		super();
		this.addList = addList;
		this.addSet = addSet;
		this.addMap = addMap;
		this.addProp = addProp;
		this.name = name;
		this.age = age;
	}
	
	
	/**
	 * 无参构造函数
	 */
	public TestCollection() {
		super();
	}
	
	
	
	public List getAddList() {
		return addList;
	}

	public void setAddList(List addList) {
		this.addList = addList;
	}

	public Set getAddSet() {
		return addSet;
	}

	public void setAddSet(Set addSet) {
		this.addSet = addSet;
	}

	public Map getAddMap() {
		return addMap;
	}

	public void setAddMap(Map addMap) {
		this.addMap = addMap;
	}

	public Properties getAddProp() {
		return addProp;
	}

	public void setAddProp(Properties addProp) {
		this.addProp = addProp;
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
