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
		
		
		// The data type that we pass to this class will determine the
		// data type of its members
		
		GenericClass<String> myGenericClass = new GenericClass<String>();
		myGenericClass.setValue("some value");
		System.out.println(myGenericClass.getValue());
		
		GenericClass<Integer> myGenClass = new GenericClass<Integer>();
		myGenClass.setValue(100); // auto boxing
		System.out.println(myGenClass.getValue());
//		Double castInt = (Double.parseDouble(String.valueOf(myGenClass.getValue())));
		
		//double castInt = myGenClass.getValue();
		//System.out.println(castInt);
		
		//GenericClass<User> userClass = new GenericClass<User>();
		
	}

}
