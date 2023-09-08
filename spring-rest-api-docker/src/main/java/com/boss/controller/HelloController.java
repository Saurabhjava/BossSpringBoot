package com.boss.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boss.exception.CreateEmployeeException;
import com.boss.exception.EmployeeNotFoundException;
import com.boss.model.Address;
import com.boss.model.Employee;
import com.boss.repo.AddressRepo;
import com.boss.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class HelloController {
	@Autowired
	private EmployeeService eService;
	@Autowired
	private AddressRepo addRepo;
	@GetMapping(produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> allEmployee() {
		return eService.getAllEmployee();
	}
	@GetMapping("/{eid}")
	public ResponseEntity<Object> getEmployeeByID(@PathVariable("eid") int empid) throws EmployeeNotFoundException {
		Employee e= eService.getEmployeeByID(empid);
		if(e!=null)
			return new ResponseEntity<Object>(e, HttpStatus.OK);
		else
			throw new EmployeeNotFoundException("Employee Not Available");
	}
	@PostMapping(consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> createEmployee(@RequestBody Employee e) throws CreateEmployeeException{
		eService.addEmployee(e);
		return eService.getAllEmployee();
	}
	@PutMapping
	public List<Employee> updateEmployee(@RequestBody Employee e){
		eService.updateEmployee(e);
		return eService.getAllEmployee();
	}
	
	@DeleteMapping("/{empid}")
	public List<Employee> deleteEmployee(@PathVariable int empid){
		return eService.deleteEmployeeByID(empid);
	}
	@GetMapping("/address/{aid}")
	public Address getAddress(@PathVariable("aid") int aid) {
		return addRepo.findById(aid).get();		
	}
}
