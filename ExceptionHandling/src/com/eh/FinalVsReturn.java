package com.eh;

public class FinalVsReturn {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
		System.out.println(m1());
	}

	@SuppressWarnings("finally")
	public static int m1() {
		try {
			System.out.println(10 / 0);
			return 777;
		} catch (Exception e) {
			return 888;
		} finally {
			return 999;
		}
	}

}
