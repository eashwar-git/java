package com.java.basics;

import java.util.ArrayList;
import java.util.List;

public class JavaBasics {
	public static void main(String[] args) {

		ArrayList<Integer> lstOfNumbers = JavaBasics.getGivenList();
		System.out.println("Given Numbers list:" +JavaBasics.getGivenList());
		
		List<Integer> lstEvenDouble = JavaBasics.getEvenDoubleList(lstOfNumbers);
		System.out.println("Even double list:" +lstEvenDouble);
		
	}
	
	public static ArrayList<Integer> getGivenList(){
		ArrayList<Integer> lstOfNumbers = new ArrayList<Integer> ();
		lstOfNumbers.add(1);
		lstOfNumbers.add(2);
		lstOfNumbers.add(3);
		lstOfNumbers.add(4);
		lstOfNumbers.add(5);
		lstOfNumbers.add(6);
		return lstOfNumbers;
	}
	
	public static ArrayList<Integer> getEvenDoubleList(ArrayList<Integer> lstOfNumbers) {
		
		ArrayList<Integer> lstResult = new ArrayList<Integer> ();
		
		for(Integer num:lstOfNumbers ) {
			if(JavaBasics.isEven(num) ) {
				lstResult.add(2*num);
			}
		}
		return lstResult;
	}
	
	public static boolean isEven(Integer num ) {
		if(num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
