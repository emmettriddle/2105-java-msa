package com.revature.daotests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.revature.models.Breed;
import com.revature.repositories.BreedDAO;

public class BreedDaoTests {
	
	private BreedDAO bdao = new BreedDAO();
	
	@Test
	public void getAllBreedsTest() {
		
		List<Breed> breeds = new ArrayList<Breed>();
		Breed b = new Breed(1, "Calico");
		Breed b2 = new Breed(2, "Bengal");
		Breed b3 = new Breed(3, "Tabby");
		Breed b4 = new Breed(4, "Sphynx");
		Breed b6 = new Breed(6, "Panther");
		Breed b7 = new Breed(7, "ninja");
		Breed b8 = new Breed(8, "marmalade");
		Breed b9 = new Breed(9, "blue");
		
		breeds.add(b);
		breeds.add(b2);
		breeds.add(b3);
		breeds.add(b4);
		breeds.add(b6);
		breeds.add(b7);
		breeds.add(b8);
		breeds.add(b9);
	
		Assert.assertEquals(breeds, bdao.getAll());
		
//		System.out.println(bdao.getAll());
		
	}
	
	@Test
	public void getBreedByIdTest() {
		
		System.out.println(bdao.getById(5));
	}
	
	@Test
	public void addBreedTest() {
		
		Breed b = new Breed("Add Test 3");
		
		System.out.println(bdao.add(b));
		
//		Assert.assertEquals(true, bdao.add(b));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
