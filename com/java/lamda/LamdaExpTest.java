package com.java.lamda;

public class LamdaExpTest  {
	public static void main(String[] args) {

		LamdaExpTestInterface ex = new LamdaExpTestInterface() {
			public int calc(int a, int b) {
				return a+b;
			}
	};
	System.out.println("with Anonymous inner class impl: "+ex.calc(10, 15));
	
	
	LamdaExpTestInterface ex1 = (a,b)->  a+b;
	System.out.println("with Lambda expression :"+ex1.calc(10, 15));
	
	
	LamdaExpTestInterface ex2 = (a,b)->  a*b;
	System.out.println("with Lambda expression :"+ex2.calc(10, 15));
}
}
