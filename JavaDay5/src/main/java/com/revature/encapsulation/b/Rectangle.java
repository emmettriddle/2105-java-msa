package com.revature.encapsulation.b;

import com.revature.encapsulation.a.Shape;

// Extends is the keyword we use to create child classes or subclasses => when we want to 'extend' that class
public class Rectangle extends Shape {
	
	public void publicRectangleMethod() {
		System.out.println("Public Recatngle Method");
		this.protectedMethod();
	}

}
