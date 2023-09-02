package com.cts.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.cts.model.Customer;

@EnableScan
public interface CustomerRepository extends CrudRepository<Customer,String> {

}
