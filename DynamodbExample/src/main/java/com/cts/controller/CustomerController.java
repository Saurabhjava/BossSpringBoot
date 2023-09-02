package com.cts.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Customer;
import com.cts.repository.CustomerRepository;

@RestController
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	private CustomerRepository cRepo;
	@GetMapping
	public Iterable<Customer> getAll(){
		return cRepo.findAll();
	}
	@PostMapping
	public String createCustomer(@RequestBody Customer cust) {
		cRepo.save(cust);
		return "Customer Created";
	}
}
