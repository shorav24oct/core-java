package com.citi;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		B b = new B();
		b.setJ(10);

		A a = new A();
		a.setI(11);

		A a2 = (A) a.clone();

		System.out.println(a2.getI());
		System.out.println(a2.getB());
	}

}
