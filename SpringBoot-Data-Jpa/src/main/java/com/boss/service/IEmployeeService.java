package com.boss.service;

import java.util.List;

import com.boss.entity.Employee;

public interface IEmployeeService {
	public void addEmployee(Employee emp);
	public Employee getEmployee(int empid);
	public void deleteEmployee(int empid);
	public void updateEmployee(Employee emp);
	public List<Employee> getEmployeeByName(String name);
	public List<Employee> getEmployeeByNameAndEmail(String name, String email);
	
	public List<Employee> myQuery();
}

