package com.boss.bean;

import org.springframework.stereotype.Component;

@Component
public class UsEmployee implements ICalculateSalary {

	@Override
	public double calculate() {
		System.out.println("Salary For US Employee");
		return 0;
	}

}
