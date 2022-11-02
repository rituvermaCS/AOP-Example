package com.ritu;

public class Employee {
	
	private String name;
	private String surName;
	
	public void setFullName(String name, String surName) {
		this.name = name;
		this.surName = surName;
	}
	
	public String getFullName(String name, String surName) {
		return name + " " + surName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surName=" + surName + "]";
	}

}
