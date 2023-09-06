package com.bosch;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bosch.bean.CurrencyConversion;

//@FeignClient(name="exchange-service",url = "http://localhost:8081")
@FeignClient(name="exchange-service")
//@LoadBalancerClient(name="exchange-service")
public interface ExchangeProxy {
	@GetMapping("exchange/from/{from}/to/{to}")
	public CurrencyConversion getExchageValue(@PathVariable String from,@PathVariable String to);
}
