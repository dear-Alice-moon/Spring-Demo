package com.moon.bean.extend;

public class HelloWorld {
	
	private String message1;
	
	private String message2;
	
	private String test;
	
	private boolean flagg;
	
	
	@Override
	public String toString() {
		return "HelloWorld [message1=" + message1 + ", message2=" + message2 + ", test=" + test + ", flagg=" + flagg
				+ "]";
	}


	public HelloWorld(String message1, String message2) {
		super();
		this.message1 = message1;
		this.message2 = message2;
	}
	

	public HelloWorld() {
		super();
	}
	
	
	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	
	public String getTest() {
		return test;
	}
	
	public void setTest(String test) {
		this.test = test;
	}
	
	public boolean isFlagg() {
		return flagg;
	}

	public void setFlagg(boolean flagg) {
		this.flagg = flagg;
	}
		
}
