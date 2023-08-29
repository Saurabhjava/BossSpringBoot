package com.boss.bean;

public class Student {
	private String name;
	private static Student s=new Student();
	private Student() {
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static Student getStudent() {
		return s;
	}
}
