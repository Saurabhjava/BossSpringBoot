package com.boss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boss.model.Student;
import com.boss.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo sRepo;
	
	public void createStudent(Student s) {
		sRepo.save(s);
		System.out.println("Student Saved....");
	}
	public void createManyStudent(List<Student> s) {
		sRepo.saveAll(s);
		System.out.println("Student Saved....");
	}
	public List<Student> getAllStudent() {
		return sRepo.findAll();
	}
	public Student getStudent(int sid) {
		return sRepo.findById(sid).get();
	}
	public List<Student> getStudentByMarks(int marks) {
		return sRepo.findByMarksLessThan(marks);
	}
}
