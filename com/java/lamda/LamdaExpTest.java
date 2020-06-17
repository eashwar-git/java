package com.java.lamda;

public class LamdaExpTest {
	public static void main(String[] args) {

	
// 1. calculate two numbers 		
		
		// through Anonymous inner class
		CalcInterface ex = new CalcInterface() {
			public int calc(int a, int b) {
				return a + b;
			}
		};
		System.out.println("with Anonymous inner class impl: " + ex.calc(10, 15));

		// through Lamda expression
		CalcInterface ex1 = (a, b) -> a + b;
		System.out.println("with Lambda expression :" + ex1.calc(10, 15));

// 2. get a value 
		
		
		
		
		GetValueInterface getInterface = new GetValueInterface() {
			public double getValue() {
				return 1.1;				
			}
		};
		
		
		GetValueInterface getInterfaceLambda = () ->  1.1; 
		
		System.out.println("with Anonymous inner class impl: " +getInterface.getValue());
		System.out.println("with Lambda expression :"+getInterfaceLambda.getValue());
		
		
// 3. Reverse of a string 
// through Anonymous inner class
		ReverseInterface iRev = new ReverseInterface() {
			public String reverse(String n) {
				StringBuilder rv = new StringBuilder();
				rv.append(n);
				rv = rv.reverse();
				return rv.toString();
			}
		};
		System.out.println("with Anonymous inner class impl: " +iRev.reverse("abc"));
		
		
		// through Lamda expression
		ReverseInterface intRevLamda = str ->  {
						StringBuilder rv1 = new StringBuilder();
						rv1.append(str);
						rv1 = rv1.reverse();
						return rv1.toString();
				};
				
				System.out.println("with Lambda expression :"+intRevLamda.reverse("abc"));
				
				
				
				
				
				
				
				

	}
}
