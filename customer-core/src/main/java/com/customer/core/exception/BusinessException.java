package com.customer.core.exception;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1943576425595203540L;

	public BusinessException(String errorMessage) {
		super(errorMessage);
	}
}
