package com.lp;

public class InternDemo {

	public static void main(String[] args) {
		String s1 = new String("anu");
		String s2 = s1.intern();
		System.out.println(s1 == s2);
		String s3 = "anu";
		System.out.println(s2 == s3);
	}

}
