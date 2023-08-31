package com.boss.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boss.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer>{
	public List<Employee> findByName(String name);
	public List<Employee> findByNameAndEmail(String name,String email);
	
	@Query("select e from Employee e")
	public List<Employee> getAllEmployee();
}
