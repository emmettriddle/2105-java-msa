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
//		Car c = new Car();
//		
//		c.drive(); 
//		
//		Subaru cross = new Subaru("Crosstrek", 12, "blue");
//		
//		System.out.println(cross);
//		
//		cross.drive();
//		
//		cross.driveSomeDistance(3000);
//		
//		System.out.println(cross);
//		
//		Car newCar = new Subaru("another car", 1000, "silver");
//		
//		newCar.drive();
//		newCar.drive(10);
//		
//
//		System.out.println(newCar);
//		
//		Subaru castCar = (Subaru) newCar;
//		
//		castCar.driveSomeDistance(10);
//		
//		System.out.println(newCar);
//		
//		Car castCross = (Car) cross;
//		
//		crash(cross);
		
		
		// Create a Person
		Person dan = new Person("Dan", 100);
		
		Subaru s = new Subaru("Crosstrek", 6000, "red");
		
		dan.setCar(s);
		
		System.out.println(dan);
		
		Car c = new Car("Honda", 750000, "silver");
		
		Person p = new Person("Dumbledore", 500, c);
		
		System.out.println(p);
		
		Person ron = new Person("Ron", 50, new Car("Ford", 540000, "blue"));
		
		System.out.println(ron);
		
//		Car car = ron.getCar();
		
		ron.getCar().drive(400);
		
		c.setColor("purple");
		
		ron.setCar(null);
		
		System.out.println(ron.getCar());
//		ron.getCar().setMileage(1000);
		
		System.out.println(p);
		
//		System.out.println(p.hashCode());
//		System.out.println(c.hashCode());
//		System.out.println(ron.hashCode());
//		System.out.println(ron.getCar().hashCode());

		p.getCar().setColor("pink");
		System.out.println(c);
		System.out.println(p);
		
		
	}
	
	public static void crash(Car c) {
		System.out.println("Crash!");
	}
	
	public static void crashSubaru(Subaru s) {
		
	}

}
