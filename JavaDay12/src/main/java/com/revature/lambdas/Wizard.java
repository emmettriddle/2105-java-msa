package com.revature.lambdas;

import java.util.Arrays;
import java.util.List;

public class Wizard {
	
	@FunctionalInterface
	interface Potion {
		
		void makePotion(String ingredient);
		
	}
	
	
	String name;
	List<Magic> proficiencies;
	
	public Wizard(String name, Magic... proficiencies) { // Magic[]
		this.name = name;
		this.proficiencies = Arrays.asList(proficiencies);
	}
	
	Potion shrink = (ingredient) -> System.out.println("Made a potion using " + ingredient);
	
	
	public static void main(String[] args) {
		
		Wizard hermione = new Wizard("Hermione", Spell.alohomora, Spell.fireball);
		
//		for (int i = 0; i<hermione.proficiencies.size(); i++) {
//			hermione.proficiencies.get(i).castSpell();
//		}
		
		// Enhanced for loop - shorthand for above for loop
		for (Magic m : hermione.proficiencies) {
			m.castSpell();
		}
		
		hermione.proficiencies.get(0).castSpell();
		
		
//		Potion shrink = (ingredient) -> System.out.println("Made a potion using " + ingredient);
		
		hermione.shrink.makePotion("mushroom");
		
		
		Wizard merlin = new Wizard("Merlin", Spell.alohomora, Spell.fireball, Spell.avadaKedavra, () -> System.out.println("magicMissile"));
		
		
		merlin.proficiencies.forEach((m) -> m.castSpell());
		
		// Method Reference - A::B = method 'B' from class 'A'
		merlin.proficiencies.forEach(Magic::castSpell);
		
	}

}
