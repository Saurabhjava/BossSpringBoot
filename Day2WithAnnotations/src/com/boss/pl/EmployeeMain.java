package com.boss.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.boss.bean.Employee;
import com.boss.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		
		  ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		  EmployeeService es=(EmployeeService)ctx.getBean("eService");
		  es.printEmployee();
		 
		
		
	}

}
