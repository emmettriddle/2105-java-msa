package com.revature.comparables;

import java.util.Comparator;

public class PokemonHelper implements Comparator<Pokemon>{

	// int compare(T t, T t);
	@Override
	public int compare(Pokemon p1, Pokemon p2) {
		return p1.getId() - p2.getId();
	}
	
//	public int test(Pokemon p1, Pokemon p2) {
//		System.out.println(p1 + "\n " + p2);
//		return 1;
//	}

}
