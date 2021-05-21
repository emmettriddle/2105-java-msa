package com.revature.app;

import java.util.ArrayList;
import java.util.List;

import com.revature.exceptions.PlanetHasNoMoonsException;
import com.revature.models.Moon;
import com.revature.models.Planet;

public class OuterSpace {
	
	public static void main(String[] args) {
		
		Planet mars = new Planet("Mars", 5555555, 888848844, false);
		
//		System.out.println(mars);
//		
//		System.out.println(mars.calculateSurfaceGravity());
		
		Moon titan = new Moon("titan", 39494949, 3838288);
		Moon io = new Moon("io", 39494949, 3838288);
		Moon ganymede = new Moon("ganymede", 39494949, 3838288);
		
		List<Moon> moons = new ArrayList<Moon>();
		moons.add(titan);
		moons.add(io);
		moons.add(ganymede);
		
		Planet planet = new Planet("Test Planet", 4949494, 29292929, false);
		planet.setMoons(moons);
		
		System.out.println(planet);
		
		Planet venus = new Planet("Venus", 3939393, 4444444, true);
		
		System.out.println(venus);
		
		try {
			for (Moon moon : venus.getMoons()) {
				System.out.println(moon);
			}
		} catch (PlanetHasNoMoonsException e) {
			e.printStackTrace();
		}
		
		try {
			for (Moon moon : planet.getMoons()) {
				System.out.println(moon);
			}
		} catch (PlanetHasNoMoonsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
