package com.javainsider.java8.multipleinheritance;

public interface Person {

	default void sayHello() {
        System.out.println("Hello...");
    }
}
