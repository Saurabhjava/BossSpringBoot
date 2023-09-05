package com.boss.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Address {
	@Id
	private int aid;
	private String country;
	private String city;
}
