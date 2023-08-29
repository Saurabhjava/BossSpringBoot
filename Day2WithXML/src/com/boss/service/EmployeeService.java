package com.boss.service;

import com.boss.bean.Employee;

public class EmployeeService {
	private Employee emp;
	public EmployeeService(Employee emp) {
		this.emp=emp;
	}
	public void printEmployee() {
		System.out.println("Employee ID:"+emp.getEmpid());
		System.out.println("Employee Name:"+emp.getName());
		System.out.println("Employee Salary:"+emp.getSalary());
		System.out.println("============Employee Address=======");
		System.out.println("City:"+emp.getAddress().getCity());
		System.out.println("Country:"+emp.getAddress().getCountry());
		System.out.println("Zip:"+emp.getAddress().getZip());
	}
}


