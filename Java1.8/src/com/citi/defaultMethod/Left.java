package com.citi.defaultMethod;

public interface Left {
	default void m1() {
		System.out.println("Left.m1()");
	}
}
