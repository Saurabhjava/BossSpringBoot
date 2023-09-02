package com.boss.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.boss.model.Student;

public interface StudentRepo extends MongoRepository<Student, Integer> {
	public List<Student> findByMarksLessThan(int marks);
}
