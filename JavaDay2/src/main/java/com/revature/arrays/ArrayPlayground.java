package com.revature.arrays;

import java.util.Arrays;

/*
 * Arrays are collections of multiple values of the same type
 * 
 * Arrays have a fixed length, determined at creation
 * 
 * Arrays can be pre-populated
 * 
 * Arrays are accessed by index (starts at 0 -> length - 1)
 * 
 * 
 * */
public class ArrayPlayground {

	public static void main(String[] args) {
		
		// Array Declaration
		int[] intArray = new int[10]; // size-10 array - length of 10.
		
		// Array Literal (pre-populated)
		int[] otherArray = {1, 2, 3, 4, 5}; // length of 5
		
		System.out.println(intArray.length);
		System.out.println(otherArray.length);
		
		System.out.println(otherArray[0]); // references the 0th index of our array
		System.out.println(otherArray[4]);
		//System.out.println(otherArray[5]); Runtime Exception - ArrayIndexOutOfBoundsException
		
		
		
		//System.out.println(multiArray[0][2]);
		
		
		String[] strArray = {"Dan", "Is", "Awesome"};
		
		System.out.println(strArray[0]);
		
		int someInput = 5;
		String[] inputArray = new String[someInput];
		
		
		System.out.println("Before assigment: " + intArray[0]); // default values - int default 0
		
		intArray[0] = 100;
		
		System.out.println("After assignment: " + intArray[0]);
		
		//intArray[1] = "Hello";
		
		System.out.println(otherArray);
		System.out.println(strArray);
		
		System.out.println(Arrays.toString(otherArray));
		System.out.println(Arrays.toString(strArray));
		
		System.out.println(" :::: FOR LOOP ::::");
		/*
		 * For Loops
		 * 
		 * for (initialization; condition; update) { instructions }
		 * */ 
		for (int index = 0; index < otherArray.length; index++) {
			System.out.println("Index: " + index);// unary operator - increment decrement 
			System.out.println("Value at Index: " + otherArray[index]);
		}
		
		// Enhanced For Loop
		for (int num : otherArray) {
			System.out.println(num);
		}
		
		for (String s : strArray) {
			System.out.println(s);
			
		}
		
		int[][] multiArray = {{1, 2, 3}, {4, 6, 5}};
		
		for (int[] row: multiArray) {
			for (int num: row) {
			System.out.println(num);
			}
		}
		
		
		
		
		
		
		
	}
	
	
	
}
