package com.boss.bean;

import org.springframework.stereotype.Component;

@Component
public class IndianEmployee implements ICalculateSalary {

	@Override
	public double calculate() {
		System.out.println("Salary For Indian Employee...");
		return 0;
	}

}
