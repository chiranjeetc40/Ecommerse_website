package com.yash.vendormicroservice.exception;

public class QuantityLimitExceededException extends Exception{

	public QuantityLimitExceededException(String message) {
		super(message);
	}

}
