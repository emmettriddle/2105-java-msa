package com.revature.abstraction;

public class RedGiant extends Star {
	
	public RedGiant() {
		this("Default Red Giant Name");
	}
	
	public RedGiant(String name) {
		this.name = name;
	}

	@Override
	public void supernova() {
		System.out.println("RedGiant's version of a supernova.");
		
	}
	
	public void redGiantCanDo() {
		System.out.println("Only I can do this...");
	}
	
	@Override
	public void solarFlare() {
		super.solarFlare(); // another way to override or add implementation to parent methods - DRY
		System.out.println("Yikes");
		
		// super();
		// super.
		// this.
		// this();
	}

	@Override
	public void twinkle() {
		// TODO Auto-generated method stub
		
	}
	
	

}
