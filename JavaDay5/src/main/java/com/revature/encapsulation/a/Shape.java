package com.revature.encapsulation.a;

public class Shape {
	
//	public static void main(String[] args) {
//		Shape s = new Shape();
//		s.privateMethod();
//	}
	
	public void publicMethod() {
		System.out.println("Hello from the public method!");
	}
	
	protected void protectedMethod() {
		System.out.println("Hello from the protected method!");
	}
	
	// With default access level - there is no access modifier
	void defaultMethod() {
		System.out.println("Hello from the default method...");
	}
	
	private void privateMethod() {
		System.out.println("Hello from the private method!");
	}

}
