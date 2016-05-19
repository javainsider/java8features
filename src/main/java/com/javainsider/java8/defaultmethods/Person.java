package com.javainsider.java8.defaultmethods;

public interface Person {
	
	default void sayHello() {
		System.out.println("Hello.....");
	}
	
	public void sayGoodby();

}
