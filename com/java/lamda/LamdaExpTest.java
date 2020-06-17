package com.java.lamda;

public class LamdaExpTest {
	public static void main(String[] args) {

		// through Anonymous inner class
		InterfaceCalc ex = new InterfaceCalc() {
			public int calc(int a, int b) {
				return a + b;
			}
		};
		System.out.println("with Anonymous inner class impl: " + ex.calc(10, 15));

		// through Lamda expression
		InterfaceCalc ex1 = (a, b) -> a + b;
		System.out.println("with Lambda expression :" + ex1.calc(10, 15));

// through Anonymous inner class
		InterfaceReverse iRev = new InterfaceReverse() {
			public String reverse(String n) {
				StringBuilder rv = new StringBuilder();
				rv.append(n);
				rv = rv.reverse();
				return rv.toString();
			}
		};
		System.out.println("with Anonymous inner class impl: " +iRev.reverse("abc"));
		
		
		// through Lamda expression
				InterfaceReverse intRevLamda = str ->  {
						StringBuilder rv1 = new StringBuilder();
						rv1.append(str);
						rv1 = rv1.reverse();
						return rv1.toString();
				};
				
				System.out.println("with Lambda expression :"+intRevLamda.reverse("abc"));

	}
}
