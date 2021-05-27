package com.revature.app;

import java.util.List;

import com.revature.models.Breed;
import com.revature.repositories.BreedRepository;
import com.revature.utils.MockDB;

public class Driver {
	
	public static void main(String[] args) {
		
		BreedRepository br = new BreedRepository();
		
		List<Breed> breeds = br.getAll();
		
		for (Breed b : breeds) {
			System.out.println(b);
		}
//		System.out.println("\n\n");
//		
//		for (Breed b : MockDB.breeds) {
//			System.out.println(b);
//		}
	}

}
