package com.revature.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionPlayground {
	
	public static void main(String[] args) {
		
		// Creating a List
		//List<String> names = new ArrayList<String>();
		
		/*
		 * Why List<> and ArrayList<>
		 * 
		 * Coding to interfaces - any implementation of List shares functionality (.add(), .remove(), .size(), etc).
		 * 
		 * All lists share these methods - they have their own implementations
		 * 
		 * */
		// Old Way
//		String[] names2 = new String[5];
//		names2[0] = "Dan";
//		System.out.println(names2.length);
		
		// Collections way
//		System.out.println(names.size());
//		names.add("Dan");
//		System.out.println(names.size());
//		names.add("Ryan");
//		System.out.println(names.size());
//		names.add("Sierra");
//		System.out.println(names.size());
//		names.add("Adam");
//		System.out.println(names.size());
//		names.add("Richard");
//		System.out.println(names.size());
//		
//		names.add(2, "Tyler");
//		
//		System.out.println(names);
//		System.out.println(names.size());
//		
//		
//		List<String> other = new LinkedList<String>(names);
//		
//		other.
//		
//		System.out.println(other);
//		

		List<User> users = new ArrayList<User>();
		
		User u = new User("admin", "password", 100);
		User u2 = new User("bono", "pass", 99);
		

		users.add(u);
		users.add(u2);
		users.add(u);
		users.add(u2);
		users.add(u);
		users.add(u2);
		users.add(u);
		
		System.out.println(users);
		
		for (User user : users) {
			user.setAge(user.getAge() + 1);
		}
		
		for (User user : users) {
			System.out.println(user);
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
