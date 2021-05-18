package com.revature.encapsulation.b;

import com.revature.encapsulation.a.Shape;

public class BPlayground {
	
	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		s.publicMethod();
//		s.protectedMethod(); // only accessible in the same package and or in child classes
//		s.defaultMethod(); // only the package
//		s.privateMethod(); // only that class
		
		Rectangle r = new Rectangle();
		
		r.publicMethod(); 
		r.publicRectangleMethod();
	}

}
