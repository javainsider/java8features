package com.javainsider.java8.defaultmethods;

public class TestJavaPerson {

	public static void main(String[] args) {
		JavaPerson javaPerson = new JavaPerson();

		// calling sayHello method calls the method defined in interface
		javaPerson.sayHello();

		// calling sayGoodby- method calls the method implemented in JavapPerson
		javaPerson.sayGoodby();
	}

}
