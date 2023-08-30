package com.boss.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boss.bean.Employee;

@Service("eService")
public class EmployeeService {
	@Autowired
	private Employee emp;
	 
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


