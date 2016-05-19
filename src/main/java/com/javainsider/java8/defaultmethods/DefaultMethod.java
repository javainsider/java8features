package com.javainsider.java8.defaultmethods;

public interface DefaultMethod {
	
	int addNumber(int num1, int num2);
		
	default int multiplyNumber(int num1 , int num2){
		
		return num1 * num2;
	}


}
