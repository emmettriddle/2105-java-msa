package com.revature.methods;

/*
 * Anatomy of a method
 * 
 * Access Modifier  +  Non-Access Modifier(optional) + Return Type + methodName( Parameters ) { method body } 
 * 
 * Access Modifier - used to define how accessible the given method is
 * 
 * Non-Access Modifier - special keyword that can add or limit functionality to the given method
 * 
 * Return Type - what type of data the method must return. 
 * 	Every method must have a return type!! - If it doesn't return anything -> void
 * 
 * Name - the name we use to call that method
 * 
 * Parameters - are optional - list of placeholder variables that will be passed into the method when it is called
 * 
 * 
 * 
 * Methods are written in camelCase
 * */


public class MethodPlayground {
	
	public static void main(String[] args) {
		
		myMethod();
		int result = add(5, 17);
		System.out.println(result);
		
		System.out.println(add(10, 2));
		
	}
	
	public static void myMethod() {
		System.out.println("Hello from inside my Method!");
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

}
