package com.javainsider.java8.multipleinheritance;

public interface Male {

	default void sayHello() {
        System.out.println("Hello Mr....");
    }
}
