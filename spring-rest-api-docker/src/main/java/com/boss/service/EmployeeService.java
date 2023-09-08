package com.boss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boss.exception.CreateEmployeeException;
import com.boss.model.Employee;
import com.boss.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository eRepo;
	
	public List<Employee> getAllEmployee() {
		return eRepo.findAll();
	}
	public Employee getEmployeeByID(int empid) {
		Optional<Employee> op=eRepo.findById(empid);
		if(op.isPresent())
			return op.get();
		else
			return null;
	}
	public void addEmployee(Employee e) throws CreateEmployeeException {
		if(e.getName()==null || e.getEmail()==null || e.getAddress()==null) {
			throw new RuntimeException("Invalid Data");
		}
		else {
			if(getEmployeeByID(e.getEmpid())!=null)
				throw new CreateEmployeeException("Employee Already Available...");
			else
				eRepo.saveAndFlush(e);
		}
	}
	public void updateEmployee(Employee e) {
		if(getEmployeeByID(e.getEmpid())!=null)
			eRepo.saveAndFlush(e);
		else
			throw new RuntimeException("Employee not available");
	}
	public List<Employee> deleteEmployeeByID(int empid) {
		eRepo.deleteById(empid);
		return eRepo.findAll();
	}
}
