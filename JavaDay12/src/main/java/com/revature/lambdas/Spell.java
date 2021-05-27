package com.revature.lambdas;

public class Spell {
	
	// Create Static Methods
	
	static Magic fireball = () -> { System.out.println("Hurls a magic fireball!"); };

	static Magic alohomora = () -> {
		System.out.println("The lock is now open!");
	};
	
	static Magic avadaKedavra = () -> {
		System.out.println("This curse is unforgivable...");
	};


	
	
}
