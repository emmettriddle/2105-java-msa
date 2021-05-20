package com.revature.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsPlayground {
	
	public static void main(String[] args) {
		
		
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(intArray[0]);
		
		System.out.println(intArray[6]);
		
		try {
			System.out.println(intArray[4]);
			FileInputStream f = new FileInputStream("../applications.properties");
			
		} catch (ArrayIndexOutOfBoundsException | FileNotFoundException e) {
			
			e.printStackTrace();
		
			
		} finally {
			
			System.out.println("This will execute ALWAYS - WITH OR WITHOUT AN EXCEPTION");
		}
		
		
		System.out.println(intArray[8]);
		
	}

}
