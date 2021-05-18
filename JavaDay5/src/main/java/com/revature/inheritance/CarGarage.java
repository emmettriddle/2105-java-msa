package com.revature.inheritance;

public class CarGarage {
	
	public static void main(String[] args) {
		
//		Car c = new Car("New Car", 800, "black");
//		System.out.println(c);
//		
//		System.out.println(c.getName());
//		System.out.println(c.getMileage());
//		System.out.println(c.getColor());
//		
//		c.setName(null);
//		c.setMileage(-9);
//		c.setColor(null);
//		
//		System.out.println(c);
//		
//		c.setName("Crosstrek");
//		c.setMileage(100000);
//		c.setColor("purple");
//		
//		System.out.println(c);
		Car c = new Car();
		
		c.drive(); 
		
		Subaru cross = new Subaru("Crosstrek", 12, "blue");
		
		System.out.println(cross);
		
		cross.drive();
		
		cross.driveSomeDistance(3000);
		
		System.out.println(cross);
		
		Car newCar = new Subaru("another car", 1000, "silver");
		
		newCar.drive();
		newCar.drive(10);

		System.out.println(newCar);
		
	}

}
