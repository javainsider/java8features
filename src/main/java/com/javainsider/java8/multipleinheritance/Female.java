package com.javainsider.java8.multipleinheritance;

public interface Female {
	default void sayHello() {
        System.out.println("Hello Ms....");
    }
}
