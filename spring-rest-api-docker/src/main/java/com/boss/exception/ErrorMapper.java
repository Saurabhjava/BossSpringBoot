package com.boss.exception;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMapper {
	private String uri;
	private String message;
	private LocalDate now;
}
