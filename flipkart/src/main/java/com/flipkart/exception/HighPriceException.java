package com.flipkart.exception;

public class HighPriceException extends Exception {
	public String toString() {
		return "hey stupid price should not be more than 100 rupees otherwise my shop will close";
	}
}
