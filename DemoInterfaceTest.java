package com.java.basics;

public class DemoInterfaceTest {

	public static void main(String[] args) {
		Demo d = new DemoImpl();
		d.m1();
		System.out.println(d.sum(5,6));
	}
}
