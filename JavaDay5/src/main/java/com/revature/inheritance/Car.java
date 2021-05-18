package com.revature.inheritance;

public class Car {
	
	// Instance Variables
	private String name; // we want to make sure this name is never null
	private int mileage;
	private String color;
	
	public Car() {
		System.out.println("Calling the Car Constructor");
	}

	// Constructor
	public Car(String name, int mileage, String color) {
		super();
		this.name = name;
		this.mileage = mileage;
		this.color = color;
	}
	
	// Getters and Setters (trusted mediators between the rest of the program and the data in this class' fields)
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			System.out.println("Cannot have a null value for name!!");
			return; // return in a void method just causes the method to end immediately
		}
		
		this.name = name;
	}
	
	public int getMileage() {
		return this.mileage;
	}
	
	public void setMileage(int mileage) {
		
		if (mileage < 0) {
			System.out.println("Mileage cannot be less than 0!");
			return;
		}
		
		this.mileage = mileage;
		
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		
		if (color == null) {
			System.out.println("Color can't be null!");
			return;
		}
		
		this.color = color;
	}
	
	
	// Methods - Method Overloading - Static or Compile time Polymorphism
	public void drive() {
		System.out.println("The car drives");
	}
	
	public void drive(int distance) {
		System.out.println("The car drives " + distance + ".");
	}

	@Override
	public String toString() {
		return "Car [name=" + this.name + ", mileage=" + this.mileage + ", color=" + this.color + "]";
	}
	
	
	
	
	

}
