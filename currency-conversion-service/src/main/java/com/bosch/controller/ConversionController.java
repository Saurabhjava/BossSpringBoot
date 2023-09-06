package com.bosch.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bosch.ExchangeProxy;
import com.bosch.bean.CurrencyConversion;

@RestController
@RequestMapping("/conversion")
public class ConversionController {
	/*
	 * @Autowired private RestTemplate template;
	 * 
	 * @GetMapping("/from/{from}/to/{to}/qty/{quantity}") public CurrencyConversion
	 * convert(@PathVariable String from,@PathVariable String to,@PathVariable int
	 * quantity) { Map<String, String> m=new HashMap<>(); m.put("from",from);
	 * m.put("to", to); //ResponseEntity<CurrencyConversion>
	 * cc=template.getForEntity("http://localhost:8081/exchange/from/{from}/to/{to}"
	 * ,CurrencyConversion.class,m); ResponseEntity<CurrencyConversion>
	 * cc=template.getForEntity("http://localhost:8081/exchange/from/{from}/to/{to}"
	 * ,CurrencyConversion.class,from,to); CurrencyConversion bean=cc.getBody();
	 * bean.setQuantity(quantity);
	 * bean.setTotalValue(quantity*bean.getConversionValue()); return bean; }
	 */
	@Autowired
	private ExchangeProxy proxy;
	
	@GetMapping("/from/{from}/to/{to}/qty/{quantity}")
	public CurrencyConversion convert(@PathVariable String from,@PathVariable String to,@PathVariable int quantity) {
		CurrencyConversion cc=proxy.getExchageValue(from, to);
		cc.setQuantity(quantity);
		cc.setTotalValue(quantity*cc.getConversionValue());
		return cc;
	}
}
