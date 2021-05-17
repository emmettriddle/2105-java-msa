package com.revature.classesobjects;

public class AnimalShelter {
	
	public static void main(String[] args) {
		
		// Use the constructor to create a Dog Object
		// This will reserve the memory needed to store all information about our Dog Object
		// Datatype + Reference Variable  = new keyword + Constructor(); 
		Dog myDog = new Dog(); // Reference Variable - stores an objects location in memory
		myDog.name = "Fido";
		
		Dog notMyDog = new Dog();
		notMyDog.name = "Jane";
		
		System.out.println(myDog.name);
		System.out.println(notMyDog.name);
		System.out.println(myDog.isFed);
		
		myDog.bark();
		notMyDog.bark();
		
		myDog.bark(8);
		notMyDog.bark(11);
		
		myDog.bark("Bark");
		
		
		Dog spot = new Dog("Spot", "Corgi", 5);
		
		System.out.println(spot.isFed);
		
		Dog testDog = new Dog();
		
		testDog.bark(); // this will return null says Arf arf - value of any object not instantiated (doesn't exist) == null
		System.out.println(testDog.name);
		
		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = myDog;
		dogArray[1] = notMyDog;
		dogArray[2] = spot;
		
		for (Dog d : dogArray) {
			System.out.println(d);
		}
		
		// When printing an object - we are implicitly calling the .toString() method on it. 
		// toString() is a method provided by the Object Class
		// ALL Objects in Java are children of the Object Class
		
	}

}
