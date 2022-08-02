package com.lp;

public class CreateImmutable {

	private int i;

	public CreateImmutable(int i) {
		this.i = i;
	}

	public CreateImmutable modify(int i) {
		if (this.i == i)
			return this;
		else
			return new CreateImmutable(i);
	}

	public static void main(String[] args) {
		CreateImmutable c1 = new CreateImmutable(10);

		CreateImmutable c2 = c1.modify(100);
		CreateImmutable c3 = c1.modify(10);

		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		
		CreateImmutable c4 = c1.modify(100);
		System.out.println(c2 == c4);

	}

}
