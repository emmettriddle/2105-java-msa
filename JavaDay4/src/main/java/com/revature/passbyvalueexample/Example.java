package com.revature.passbyvalueexample;

public class Example {
	
	// You can define classes in other classes
	// I made this static so that we don't need an instance of Example Class in order to make a dog instance
	public static class Dog {
		String name;
	}
	
	public static void main(String[] args) {
		
//		int x = 5;
//		change(x);
//		System.out.println(x);
//		x = actuallyChange(x);
//		System.out.println(x);
		
		Dog d = new Dog();
		System.out.println(d.hashCode());
		d.name = "Petunia";
		
		someChange(d);
		
		System.out.println(d.name);
		
		System.out.println(d.hashCode());
		anotherChange(d);
		System.out.println(d.hashCode());
		System.out.println(d.name);
		
	}
	
	//Method
	public static void someChange(Dog d) {
		// Because Java is Pass By Value - this does not change the Dog d in main method
		// we passed the value of d into this method - value of d -> reference to an address/location in memory
		// Then we call a new Constructor() -> 
				
		d = new Dog();
		// and because Java makes copies of values that it passes into methods
		// this d now points to a new location in memory (our d in main method has not changed).
		System.out.println("Inside some change: " + d.hashCode());
		d.name = "Jimmy";
	}
	
	// if we wanted to make a change
	public static void anotherChange(Dog d) {
		d.name = "Harry";
		System.out.println(d.hashCode());
	}
	
	
	public static void change(int x) {// Java makes a copy of the value of x (Primitive)
		// and so - even though we set x = 10, this does not affect x in main().
		x = 10;
	}
	
	//if we wanted to change the value of x...
	public static int actuallyChange(int x) {
		x = 10;
		return x;
	}

}
