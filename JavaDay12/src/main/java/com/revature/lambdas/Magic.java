package com.revature.lambdas;

@FunctionalInterface
public interface Magic {

//	// variables
//	double G = 6.67E-11;
	
	void castSpell();
	
	default void beOminous() { // N.B. 'default' here is not the Access Modifier that provides package-private access
		System.out.println("Boo");
	}
}
