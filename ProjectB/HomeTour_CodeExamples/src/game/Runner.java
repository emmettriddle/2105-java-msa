package game;

import java.util.Scanner;

import fixtures.Room;

public class Runner {
	// We only need one room manager, so we will make it static
	private static RoomManager manager = new RoomManager(4);
	
	// Boolean used to control when our game is running. We set it to true initially
	private static boolean running = true;
		
	// Main method
	public static void main(String[] args) {
		// Run the init method to instantiate our house
		manager.init();		
		
		// Create the player here. Note: We would have made the player a static object as well...
		Player player = new Player();
		
		System.out.println("Here, we can print a message about"
				+ "how to play the game. "
				+ "\nIncluding directions and what commands to use..."
				+ "\nYou can also save this message as a method which prints "
				+ "\nto the console, if you want to be able to print"
				+ "\nthe instructions at any time...");
		
		
		// The player should start in the 'starting room'
		player.setCurrentRoom(manager.getStartingRoom());
		
		while (running) {
			printRoom(player);
			String[] input = collectInput();
			parse(input, player);
		}
		
		if (!running) {
			System.out.println("Thanks for playing");
		}
	}
	
	// This method prints information to the console regarding the player's current location
	private static void printRoom(Player player) {
		System.out.println(":::: CURRENT ROOM ::::");
		System.out.println("Name: " + player.getCurrentRoom().getName());
		System.out.println("Short Desc: " + player.getCurrentRoom().getShortDesc());
		System.out.println("Long Desc: " + player.getCurrentRoom().getLongDesc());
		// You can also print information about connecting rooms here...
	}
	
	// Method used to gather input from the user, and converts it to an array
	private static String[] collectInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String[] phrase = input.split(" ");
		return phrase;
	}
	
	private static void parse(String[] command, Player player) {
		String action = command[0].toUpperCase().intern();
		String direction = null;
		
		if (command.length > 1) {
			direction = command[1].toUpperCase().intern();
		}
		
		if (action == "GO" | action == "MOVE") {
			System.out.println("You try to move: " + direction);
			Room move = player.getCurrentRoom().getExit(direction);
			player.setCurrentRoom(move);
		} else if (action == "QUIT") {
			running = false;
		}
	}
}
