package com.lp;

public class Test {
	
	int i = 10;
	int j = 20;
	
	public static void main(String[] args) {
		Test test1 = new Test();
		
		Test test2 = test1;
		
		/*
		 * System.out.
		 * println("Before Changing the value of object 1, the object 2 will be -");
		 * System.out.println("obj2 i= "+ test2.i + " obj2 j= " + test2.j);
		 * 
		 * test1.i = 40; test1.j = 50;
		 * 
		 * System.out.
		 * println("After Changing the value of object 1, the object 2 will be -");
		 * System.out.println("obj2 i= "+ test2.i + " obj2 j= " + test2.j);
		 */
		
		Test test3 = new Test();
		test3.i = test1.i;
		test3.j = test1.j;
		
		System.out.println("Before Changing the value of object 1, the object 3 will be -");
		System.out.println("test3 i= "+ test3.i + " test3 j= " + test3.j);
		
		test1.i = 60;
		test1.j = 80;
		
		System.out.println("After Changing the value of object 1, the object 3 will be -");
		System.out.println("test3 i= "+ test3.i + " test3 j= " + test3.j);
		
	}
	
}
