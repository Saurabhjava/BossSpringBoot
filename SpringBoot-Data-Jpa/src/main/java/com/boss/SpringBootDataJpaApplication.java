package com.boss;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.boss.entity.Address;
import com.boss.entity.Employee;
import com.boss.service.EmployeeService;
import com.boss.service.IEmployeeService;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringBootDataJpaApplication.class, args);
		
		IEmployeeService eService=(EmployeeService)ctx.getBean("employeeService");
		
		//eService.addEmployee(new Employee("Kartik", LocalDate.parse("1986-06-22"), "Kartik3@gmail.com"));
		//Employee emp=eService.getEmployee(14);
		//System.out.println(emp);
		//eService.deleteEmployee(4);
		/*
		 * Employee emp=eService.getEmployee(5); emp.setName("Amit");
		 * eService.updateEmployee(new
		 * Employee("Rahul",LocalDate.parse("1984-02-01"),"rahul@gmail.com"));
		 */
		
		/*
		 * List<Employee> eList=eService.myQuery(); eList.forEach(System.out::println);
		 */
		/*
		 * Employee emp=new Employee("Suman",
		 * LocalDate.parse("1988-09-22"),"suman@gmail.com"); emp.setAddress(new
		 * Address("Pune", "India")); eService.addEmployee(emp);
		 */
		Employee emp=eService.getEmployee(1);
		System.out.println(emp);
		System.out.println("=============Address============");
		System.out.println(emp.getAddress());
	}

}
