package com.revature.inheritance;

public class Subaru extends Car {
	
	public Subaru() {
		//super(); // all super is doing is calling the constructor of the parent class -> Car();
		System.out.println("Calling the Subaru constructor");
	}
	
	public Subaru(String name, int mileage, String color) {
		// Constructor Chaining - implicitly calls the parent constructor
//		this.name = name;
//		this.mileage = mileage;
//		this.color = color;
		super(name, mileage, color);
	}
	
	/*
	 * Method Overriding - Dynamic or Runtime Polymorphism
	 * 
	 *
	 * */
	@Override // this annotation is not necessary - but a good failsafe to have
	public void drive() {
		System.out.println("Subarus drive nice on snow.");
	}
	
	public void driveSomeDistance(int distance) {
		this.setMileage(this.getMileage() + distance);
	}

	@Override
	public String toString() {
		return "Subaru [name=" + this.getName() + ", mileage=" + this.getMileage() + ", color=" + this.getColor() + "]";
	}

	

}
