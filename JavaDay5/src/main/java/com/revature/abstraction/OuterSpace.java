package com.revature.abstraction;

public class OuterSpace {
	
	
	public static void main(String[] args) {
		
		Star sun = new YellowDwarf();
		
		sun.supernova();
		sun.solarFlare();
		
		YellowDwarf anotherSun = new YellowDwarf();
		anotherSun.supportLifeOnPlanetEarth();
		
	}

}
