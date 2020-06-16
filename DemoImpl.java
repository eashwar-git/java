package com.java.basics;

public class DemoImpl implements Demo {

	static {
		System.out.println("in static block ");
	}
	
	
	@Override
	public void m1() {
		System.out.println("In m1 method ");
	}

	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
	

}
