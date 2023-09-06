package com.bosch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.entity.ExchangeValue;
import com.bosch.service.CurrencyService;

@RestController
@RequestMapping("exchange")
public class ExchangeConroller {
	@Autowired
	private Environment env;
	@Autowired
	private CurrencyService service;
	@GetMapping(value = "/from/{from}/to/{to}")
	public ExchangeValue getValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue ex=service.getCurrencyValue(from, to);
		ex.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return ex;
	}
}
