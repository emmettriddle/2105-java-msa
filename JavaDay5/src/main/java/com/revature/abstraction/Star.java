package com.revature.abstraction;

/*
 * Abstract Class is a class that cannot be instantiated. 
 * Abstract Classes often contain unimplemented methods that MUST be overridden by a concrete subclass. 
 * 
 * You can have concrete methods in an Abstract Class.
 * 
 * But - any class that has an abstract method - MUST be an Abstract Class
 * */

public abstract class Star {
	
	public String name;
	public int age;

	/*
	 * Abstract Methods - are methods that have no implementation (no body). They are only a method signature.
	 * Any concrete subclass that extends this abstract class will be required to implement all of the abstract methods.
	 * */
	
	public abstract void supernova();
	
	public abstract void twinkle();
	
	public void solarFlare() {
		System.out.println("Lots of radiation.");
	}
	
}
