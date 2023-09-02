package com.boss.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "studentdb")
public class Student {
	@Id
	private int sid;
	private String name;
	private LocalDate dob;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid, String name, LocalDate dob, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.dob = dob;
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dob=" + dob + ", marks=" + marks + "]";
	}

	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
