package com.eh;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
			System.out.println();
			System.out.println(10/0);
		} catch (NullPointerException nullPointerException) {
			System.out.println("Inside catch block");
		} finally {
			System.out.println("Inside final block");
			System.out.println("------------------");
		}
	}

}
