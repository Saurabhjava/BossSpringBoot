package com.bosch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ExchangeValue {
	@Id
	private int cid;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private double conversionValue;
	private int port;
	
}
