package com.javainsider.java8.multipleinheritance;

public class Martin implements Person, Male{

	@Override
	public void sayHello() {
		//Male.super.sayHello();
		System.out.println("Hello... I am Martin here....");
	}

}
