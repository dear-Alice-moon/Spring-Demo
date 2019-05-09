package com.moon.constructor;

public class SpellChecker {
	
	
	/**
	 * 测试函数： 验证 一个 Bean 含多个参数。  SpellChecker.java  2018/11/22  15:38         
	 */
	public void testForMultiEntity() {
		System.out.println("打印 SpellChecker 实体类参数");
	}
	
	
	/**
	 * 无参构造函数
	 */
	public SpellChecker() {
		super();
		System.out.println("Inside SpellChecker constructor.");
	}
	
	/**
	 * 测试函数：输出一句话.
	 */
	public void checkSpelling() {
		System.out.println("Inside checkSpelling.");
	}

	
}
