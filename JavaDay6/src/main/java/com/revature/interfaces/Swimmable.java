package com.revature.interfaces;

// Interfaces are implicitly abstract, you can add 'abstract' here - but it's redundant and makes no difference.
public interface Swimmable {

	// Interface has no constructor - Interfaces cannot be instantiated - only be implemented (or extended)
	// All fields declared within an interface are implicitly: public static final
	// Static and Final are referred to as Non-Access Modifiers
	// Static - keyword that means the variable or method that it's modifying is a class variable (class scope)
		// across all instances of that class - they share the same 'static' variable.
		// with methods - this means we don't need an instance of the class in order to call that method
	// Final - keyword that means the variable or method cannot be changed once instantiated.
	int MY_INT = 35;
	
	// abstract method - because this is an interface, the abstract keyword and public access modifier are implied
	void swim();
	
	
	// Since Java 8, we an declare and provide implementation for default methods in our interfaces
	// We can have concrete methods in our interfaces
	default void floatOnWater() {
		System.out.println("The object can float.");
	}
	
	/*
	 * 
	 * Interfaces create a 'contract' between a class and methods.
	 * Every abstract method in an interface, must be implemented (need to provide a method body)
	 *  in the concrete class that implements the Interface.
	 * 
	 * */
	
}
