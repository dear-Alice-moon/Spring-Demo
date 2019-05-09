package com.moon.bean.extend;

public class User1 {
	
	private String name;
	
	private boolean flagg;
	
	
	
	
	@Override
	public String toString() {
		return "User1 [name=" + name + ", flagg=" + flagg + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFlagg() {
		return flagg;
	}

	public void setFlagg(boolean flagg) {
		this.flagg = flagg;
	}
	
}
