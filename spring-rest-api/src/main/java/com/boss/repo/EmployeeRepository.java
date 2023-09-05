package com.boss.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boss.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
