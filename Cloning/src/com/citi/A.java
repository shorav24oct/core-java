package com.citi;

public class A implements Cloneable {
	int i;
	B b;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", b=" + b + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
