package com.eh;

class MyTest{
	int a;
	
	public void m1() {
		System.out.println("MyTest.m1()");
	}
}

class MyTestChild extends MyTest{
	/*
	 * Cannot override the final method from MyTest
	 */
	public void m1() {
		
	}
}

public class FinalFinallyFinalize {

	public static void main(String[] args) {
		
	}

}
