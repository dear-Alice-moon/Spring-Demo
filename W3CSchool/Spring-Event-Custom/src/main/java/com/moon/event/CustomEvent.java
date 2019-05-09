package com.moon.event;

import org.springframework.context.ApplicationEvent;

/**
 * 扩展 ApplicationEvent，必须定义一个默认的构造函数.
 * 
 */
public class CustomEvent extends ApplicationEvent {
	
	public Integer id;  // 测试字段
	
	
	/**
	 * 该构造函数必须定义，它是从 ApplicationEvent类 中继承的构造函数。
	 * @param source
	 */
	public CustomEvent(Object source) {
		super(source);
	}
	
	
	
	
	public String toString() {
		
		return "My Custom Event...... ";
	}

	
	public CustomEvent(Object source, Integer id) {
		super(source);
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
}
