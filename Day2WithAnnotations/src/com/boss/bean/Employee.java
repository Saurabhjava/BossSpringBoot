package com.boss.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${eid}")
	private int empid;
	@Value("${name}")
	private String name;
	private double salary;
	@Autowired
	private Address address;
	@Autowired
	@Qualifier("usEmployee")
	private ICalculateSalary calSal;
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		calSal.calculate();
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	
	/*
	 * public void setAddress(Address address) { System.out.println("Add======");
	 * this.address = address; }
	 */

}
