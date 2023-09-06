package com.bosch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.entity.ExchangeValue;
import com.bosch.repo.ExchangeRepository;

@Service
public class CurrencyService {
	@Autowired
	private ExchangeRepository repo;
	
	public ExchangeValue getCurrencyValue(String from, String to) {
		return repo.findByFromAndTo(from, to);
	}
}
