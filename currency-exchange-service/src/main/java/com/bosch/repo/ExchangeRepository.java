package com.bosch.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.entity.ExchangeValue;

public interface ExchangeRepository extends JpaRepository<ExchangeValue, Integer>{
	
	ExchangeValue findByFromAndTo(String from , String to);
}
