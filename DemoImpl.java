package com.java.basics;

public class DemoImpl implements Demo {

	@Override
	public void m1() {
		System.out.println("In m1 method ");
	}

	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
	

}
