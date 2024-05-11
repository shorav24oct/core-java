package com.citi.defaultMethod;

/*
 * Duplicate default methods named m1 with the parameters () and () are inherited from the types Right and Left
 */
public class Test implements Left, Right {

	public static void main(String[] args) {
		Test test = new Test();
		test.m1();
	}
	
	public void m1() {
		System.out.println("Test.m1()");
	}

	/*
	  @Override 
	  public void m1() { 
	  	Right.super.m1(); 
	  }
	 */

}
