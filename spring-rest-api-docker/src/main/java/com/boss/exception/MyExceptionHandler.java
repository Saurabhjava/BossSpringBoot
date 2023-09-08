package com.boss.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class MyExceptionHandler {
	@ResponseBody
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = {EmployeeNotFoundException.class})
	public ErrorMapper handleException(Exception e, HttpServletRequest req) {
		return new ErrorMapper(req.getRequestURI(), e.getMessage(), LocalDate.now());
	}
	@ResponseBody
	@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
	@ExceptionHandler(value = {CreateEmployeeException.class})
	public ErrorMapper handleException1(Exception e, HttpServletRequest req) {
		return new ErrorMapper(req.getRequestURI(), e.getMessage(), LocalDate.now());
	}
	@ResponseBody
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {Exception.class})
	public ErrorMapper handleException2(Exception e, HttpServletRequest req) {
		return new ErrorMapper(req.getRequestURI(), e.getMessage(), LocalDate.now());
	}
}
