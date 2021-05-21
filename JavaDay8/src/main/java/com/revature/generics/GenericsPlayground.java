package com.revature.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsPlayground {
	
	public static void main(String[] args) {
		
		// Generics were introduced in Java 5
		List myList = new ArrayList();
		myList.add("abc");
		myList.add(5);
		
		
//		for (Object o : myList) {
//			String str = (String) o;
//			System.out.println(str);
//		}
		
		
		List<String> strList = new ArrayList<String>();
		strList.add("abc");
		strList.add("def");
		
		for (String str : strList) {
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
	}

}
