package com.revature.repositories;

import java.util.List;

import com.revature.models.Breed;
import com.revature.utils.MockDB;

public class BreedRepository implements GenericRepository<Breed> {
	
	public Breed add(Breed b) {
		return null;
	}

	public Breed getById(Integer id) {
		
		return null;
	}

	public List<Breed> getAll() {
		return MockDB.breeds;
	}

	public void update(Breed bChange) {
//		Integer id = MockDB.breeds.indexOf(bChange);
//		bChange.setId(id);
		
	}	

	public void delete(Breed b) {
		MockDB.breeds.remove(b);
	}

}
