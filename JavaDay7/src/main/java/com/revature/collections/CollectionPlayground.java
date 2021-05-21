package com.revature.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
		
//		System.out.println(users);
//		
//		for (User user : users) {
//			user.setAge(user.getAge() + 1);
//		}
//		
//		for (User user : users) {
//			System.out.println(user);
//		}
		
		
		
		
		/*
		 * Map - an object that 'maps' keys to values.  Key, Value pairs.
		 * 
		 * A map cannot contain duplicate keys. 
		 * 
		 * Each key maps to at most one value. 
		 * 
		 * HashMap - can contain one null value for a key (only one key in the map can be null)
		 * 
		 * - HashMaps do not preserve order
		 *
		 * Map<K, V> map = new HashMap<K, V>(); 
		 * TreeMap
		 * LinkedHashMap -> preserves order of insertion
		 *
		 * */
		
		User u3 = new User("tony", "pass", 44);
		User u4 = new User("harry", "igloo", 100);
		User u5 = new User("george", "clooney", 989);
		
		
		Map<String, User> userMap = new HashMap<String, User>();
		
		userMap.put("admin", u);
		userMap.put("bono", u2);
		userMap.put("tony", u3);
		userMap.put("harry", u4);
		userMap.put("george", u5);

		System.out.println(userMap);
		
		User u6 = new User("helena", "fox", 50);
		User u7 = new User("benji", "halloween", 339);
		User u8 = new User("michael", "david", 777);
		
		List<User> userList = new ArrayList<User>();
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		
		for (User user : userList) {
			userMap.put(user.getUsername(), user);
		}
		
//		Map<String, User> copyMap = new HashMap<String, User>();
		
		System.out.println(userMap);
		
		
		// .keySet()
		for (String key : userMap.keySet()) {
			System.out.println("Key: " + key + "\nValue: " + userMap.get(key));
		}

		// .entrySet()
		for (Map.Entry<String, User> entry : userMap.entrySet()) {
			String key = entry.getKey();
			User us = entry.getValue();
			System.out.println("Key: " + key + " Value: " + us);
		}
		
		// .values()
		for (User use : userMap.values()) {
			System.out.println(use);
		}
		
		
		
		// .forEach() - *more details on how this works later - because it uses Lambdas*
		userList.forEach(user -> System.out.println(user));
		
		userMap.forEach((key, value) -> System.out.println("Key: " + key + "\nValue: " + value));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	
}
