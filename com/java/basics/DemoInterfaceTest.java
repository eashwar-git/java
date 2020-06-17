package com.java.basics;

public class DemoInterfaceTest {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.java.basics.DemoImpl");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Demo d = new DemoImpl();
		d.m1();
		System.out.println(d.sum(5,10));
	}
}
