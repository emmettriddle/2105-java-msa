package com.revature.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Collections: a class filled with static methods used to manipulate collections
 * 
 * NOT to be confused with Collection -> which is an interface that provides the standard functionality of a collection
 * 		this is sometimes also referred to as the Collection API
 * 
 * */

public class SortingPlayground {
	
	public static void main(String[] args) {
		
		// We also have an Arrays
		int[] intArr = {6, 3, 52, 44, 66, 8, 7, 2, 2333, 77, 0, 7, 21, 1, 5};
		
		
		System.out.println("Before sorting...\n");
		
		for (int i : intArr) {
			System.out.println(i);
		}
		
		Arrays.sort(intArr);
		
		System.out.println("\n\nAfter sorting...\n");
		
		for (int i : intArr) {
			System.out.println(i);
		}
		
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(6);
		intList.add(3);
		intList.add(4);
		intList.add(2);
		intList.add(0);
		
		System.out.println("\n\nIntList Before Sort");
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		
		Collections.sort(intList);
		
		System.out.println("\n\nIntList After Sort");
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		/*
		 * Both TreeSet and TreeMap order the insertion of objects into the collection based on a sorting method
		 * 
		 * 		whether it be implicit (Strings, primitives)
		 * 		or explicit (implementing Comparable or passing an instance of a Comparator to the constructor)
		 * 
		 * TreeSet and TreeMap sort at the moment of insertion.
		 * 
		 * */
		Set<String> myExampleTreeSet = new TreeSet<>();
		
		myExampleTreeSet.add("hello");
		myExampleTreeSet.add("1hello");
		myExampleTreeSet.add("!hello");
		myExampleTreeSet.add(" world");
		myExampleTreeSet.add("word");
		myExampleTreeSet.add("Word");
		myExampleTreeSet.add("WOrd");
		myExampleTreeSet.add("word!");
		
		System.out.println("\n\nTreeSets sort at insertion");
		for (String s : myExampleTreeSet) {
			System.out.println(s);
		}
		
		
//		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
//		treeMap.put(1,  "One");
//		treeMap.put(3,  "Three");
//		treeMap.put(5,  "Five");
//		treeMap.put(2,  "Two");
//		treeMap.put(4,  "Four");
		// Map<K,V>
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		treeMap.put("jambalaya",  1);
		treeMap.put("five", 5);
		treeMap.put("eighteen", 18);
		treeMap.put("acorn", 1);
		
		System.out.println("\n\nSo do TreeMaps ");
		
//		for (Integer i : treeMap.keySet()) {
//			System.out.println(i + " => " + treeMap.get(i));
//		}
		
		Iterator it = treeMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		
		Map<User, Integer> umap = new TreeMap<User, Integer>();
		
		umap.put(new User("John", 55), 10101);
		umap.put(new User("Peter", 64), 41414);
		umap.put(new User("Paul", 99), 232323);
		umap.put(new User("Mary", 32), 1212121);
		
		umap.forEach((user, num) -> System.out.println(user + " => " + num));
		
		
		//Collections col = new Collections();  // The COllections class' constructor is private
		
		
	}
	
	
	
	
	
}
