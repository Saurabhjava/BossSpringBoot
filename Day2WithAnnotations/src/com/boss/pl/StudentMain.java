package com.boss.pl;

import com.boss.bean.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student s=Student.getStudent();
		Student s1=Student.getStudent();
		
		System.out.println(s.getName());
		System.out.println(s1.getName());
		
		System.out.println(s==s1);
		
		s.setName("Amit");
		System.out.println(s.getName());
		System.out.println(s1.getName());

	}

}
