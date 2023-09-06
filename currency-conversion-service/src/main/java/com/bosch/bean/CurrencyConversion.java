package com.bosch.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyConversion {
	
	private String from;
	private String to;
	private double conversionValue;
	private int quantity;
	private double totalValue;
	private int port;

}
