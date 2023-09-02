package com.boss;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boss.model.Student;
import com.boss.service.StudentService;

@SpringBootApplication
public class SpringBootDataMongoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringBootDataMongoApplication.class, args);
		StudentService ss=(StudentService) ctx.getBean("studentService");
		//ss.createStudent(new Student(110, "Suman1", LocalDate.parse("1998-05-22"), 65));
		/*
		 * List<Student> li =new ArrayList<Student>(); li.add(new Student(105, "Kartik",
		 * LocalDate.parse("1988-05-12"), 85)); li.add(new Student(106, "Rama",
		 * LocalDate.parse("1988-05-14"), 35)); li.add(new Student(107, "Mohit",
		 * LocalDate.parse("1988-05-13"), 75)); li.add(new Student(108, "Swami",
		 * LocalDate.parse("1988-05-15"), 55));
		 * 
		 * ss.createManyStudent(li);
		 */
		
		List<Student> li=ss.getStudentByMarks(60);
		li.forEach(System.out::println);
		//System.out.println(ss.getStudent(103));
	}

}
