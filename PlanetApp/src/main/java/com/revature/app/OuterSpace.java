package com.revature.app;

import com.revature.models.Planet;

public class OuterSpace {
	
	public static void main(String[] args) {
		
		Planet mars = new Planet("Mars", 5555555, 888848844, false);
		
		System.out.println(mars);
		
		System.out.println(mars.calculateSurfaceGravity());
	}

}
