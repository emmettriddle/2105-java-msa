package com.revature.models;

public class Moon {
	
	private String name;
	private double radius;
	private double mass;
	public Moon(String name, double radius, double mass) {
		super();
		this.name = name;
		this.radius = radius;
		this.mass = mass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	@Override
	public String toString() {
		return "Moon [name=" + name + ", radius=" + radius + ", mass=" + mass + "]";
	}
	
	
	
	
	

}
