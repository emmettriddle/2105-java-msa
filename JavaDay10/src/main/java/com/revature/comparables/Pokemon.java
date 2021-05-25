package com.revature.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pokemon { //implements Comparable<Pokemon> {
	
	private String type;
	private int id;
	private String name;
	
	public Pokemon() {
		super();
	}

	public Pokemon(String type, int id, String name) {
		super();
		this.type = type;
		this.id = id;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pokemon [type=" + type + ", id=" + id + ", name=" + name + "]";
	}
	
//	@Override
//	public int compareTo(Pokemon p) { //P1.compareTo(P2)
//		//return this.getId() - p.getId();
//		//return p.getId() - this.getId(); // 1 , 0 , -1 
//		int result = this.getType().compareTo(p.getType());
//		
//		if (result != 0) {
//			return result;
//		}
//		return this.getId() - p.getId();
//		
//	}
	
	public static void main(String[] args) {
		
		List<Pokemon> myPokemon = new ArrayList<Pokemon>(); 
		myPokemon.add(new Pokemon("Fire", 4, "Charmander"));
		myPokemon.add(new Pokemon("Electric", 1000, "Pikachu"));
		myPokemon.add(new Pokemon("Water", 45, "Squirtle"));
		myPokemon.add(new Pokemon("Grass", 1, "Bublasaur"));
		myPokemon.add(new Pokemon("Psychic", 35, "Mewtwo"));
		myPokemon.add(new Pokemon("Electric", 100, "Pikachu"));
		myPokemon.add(new Pokemon("Fire", 48, "Charizard"));
		myPokemon.add(new Pokemon("Electric", 99, "Raichu"));
		
		
		// .sort() method can be overloaded by passing in a
		//comparator
		Collections.sort(myPokemon, new PokemonHelper());
		Collections.sort(myPokemon, (p1, p2) -> { return p1.getId() - p2.getId(); });
		
		
		for (Pokemon p : myPokemon) {
			System.out.println(p);
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
