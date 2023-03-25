package com.anu.exceptionHandling.Custom;

public class InvalidAgeException extends RuntimeException{
 public InvalidAgeException(String message) {
	 super(message);
}
}
