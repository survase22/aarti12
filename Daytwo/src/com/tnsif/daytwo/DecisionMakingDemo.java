package com.tnsif.daytwo;

public class DecisionMakingDemo {
	public static void main(String[] args) {

		int x = 10, y =8;
		int a = 12;
		int b = 13;
		
		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("False");
			
		}
		//    10<11     10==11
		if (!(a<b ) || (a == b)) {
			System.out.println("Condition is true ");
			
		}
		else {
			System.out.println("COndition is false ");
		}
	}
}
