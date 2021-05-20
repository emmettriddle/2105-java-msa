package com.revature.recursion;

public class RecursionDriver {

	
	public static void main(String[] args) {
		add(50,40);
		
		System.out.println(factorial(9));
		
//		while (true) {
//			System.out.println("Hello");
//		}
		
		
		
		
	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalize() method is called..");
		System.exit(0);
	}
	
	public static int add(int num1, int num2) {
		
		if (num1 + num2 == 100) {
			System.out.println("Sum is equal to 100!");
			return 100;
		} else {
			num2++;
			System.out.println("Sum is not equal ...adding one to num2." + num2);
			return add(num1, num2);
		}
	}
	
	public static int factorial(int num) {
		if(num == 0 || num == 1){
			return 1;
		}
		else {
			return factorial (num * factorial(num-1));
		}
	}

}
