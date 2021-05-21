package com.revature.models;

import java.util.List;

import com.revature.exceptions.PlanetHasNoMoonsException;

public class Planet {
	
	// Static Variable - specific to the class - same for every instance of the class
	// Final - once instantiated - can no longer be changed.
	public static final double G = 6.673E-11;
	
	
	// Instance Variable
	private String name;
	private double mass;
	private double radius;
	private boolean atmosphere;
	// Create an instance variable for Planet - that holds that planet's Moons.
	// Refactor your code to work nicely
	private List<Moon> moons;
	
	// Constructors
	public Planet() {
		super();
	}

	public Planet(String name, double mass, double radius, boolean atmosphere) {
		super();
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.atmosphere = atmosphere;
	}
	
	public Planet(String name, double mass, double radius, boolean atmosphere, List<Moon> moons) {
		super();
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.atmosphere = atmosphere;
		this.moons = moons;
	}

	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if (name == null) {
			System.out.println("Please input a valid number.");
		}
		this.name = name;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		
		this.mass = mass;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public boolean isAtmosphere() {
		return atmosphere;
	}

	public void setAtmosphere(boolean atmosphere) {
		this.atmosphere = atmosphere;
	}
	
	public List<Moon> getMoons() throws PlanetHasNoMoonsException {
		if (this.moons == null) {
//			System.out.println("This planet has no moons!");
			throw new PlanetHasNoMoonsException("This planet has no moons!");
		} else {
			return this.moons;
		}
	}
	
	public void setMoons(List<Moon> moons) {
		this.moons = moons;
	}

	
	// Methods
	public double calculateSurfaceGravity() {
		return (this.mass * G) / (Math.pow(this.radius, 2)); // (this.radius * this.radius) 
	}
	
	
	@Override
	public String toString() {
		return "Planet [name=" + name + ", mass=" + mass + ", radius=" + radius + ", atmosphere=" + atmosphere + 
				", moons=" + this.moons +"]";
	}
	
	
	
	
	
	
	
	
	
	

}
