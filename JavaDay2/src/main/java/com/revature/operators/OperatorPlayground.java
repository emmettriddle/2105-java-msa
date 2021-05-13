package com.revature.operators;

public class OperatorPlayground {
	
	public static void main(String[] args) {
		
		int x = 3;
		int y = 2;
		
//		System.out.println(x + y);
//		System.out.println(x - y);
//		System.out.println(x * y);
//		System.out.println(x / y);
//		
//		double a = 3;
//		double b = 2;
//		
//		System.out.println(a/b);
//		
//		double z = x / y;
//		
//		System.out.println(z);
//		System.out.println((double) x / y);
//		System.out.println(x / (double) y);
//		
//		System.out.println(x % y);
		
		// Determining if a variable is even
		
		// Control Flow Statements - ways in which we can affect the flow of our applications logic
		if (x % 2 == 0) {
			System.out.println(x + " is an even number!");
		} else {
			System.out.println(x + " is not an even number...");
		}
		
		if (x % 2 == 1) {
			System.out.println(x +" is an odd number.");
		}
		else {
			System.out.println(x + " is not an odd number.");
		}
		
		
		
	}

}
