package com.boss.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boss.entity.Employee;
import com.boss.repo.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeRepository empRepo;

	@Override
	public void addEmployee(Employee emp) {
		empRepo.saveAndFlush(emp);

	}

	@Override
	public Employee getEmployee(int empid) {

		Optional<Employee> op = empRepo.findById(empid);
		if(op.isPresent())
			return op.get();
		else
			return null;

		//Employee e = empRepo.getReferenceById(empid);
		//return e;
	}

	@Override
	public void deleteEmployee(int empid) {
		Optional<Employee> op = empRepo.findById(empid);
		if(op.isPresent()) {
			empRepo.delete(op.get());
			System.out.println("Employee Deleted with ID-->"+empid);
		}
		else
			System.out.println("Employee Not available");

		
	}

	@Override
	public void updateEmployee(Employee emp) {	
			empRepo.saveAndFlush(emp);
			System.out.println("Employee Updated....");	
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		List<Employee> empList=empRepo.findByName(name);
		return empList;
	}

	@Override
	public List<Employee> getEmployeeByNameAndEmail(String name, String email) {
		
		return empRepo.findByNameAndEmail(name,email);
	}

	@Override
	public List<Employee> myQuery() {
		return empRepo.getAllEmployee();
	}

}
