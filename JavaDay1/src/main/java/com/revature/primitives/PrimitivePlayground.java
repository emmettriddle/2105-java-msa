package com.revature.primitives;

public class PrimitivePlayground {
	
	public static void main(String[] args) {
		

	
	/*
	 * 
	 * All variables only hold a single value
	 * 
	 * Primitives reserve a fixed amount of memory to hold a single value of a specific type.
	 * 
	 * Whole Numbers:
	 * byte
	 * short
	 * char
	 * int
	 * long
	 * 
	 * Decimal Numbers:
	 * float
	 * double
	 * 
	 * Other:
	 * boolean
	 * 
	 * EVERYTHING else are reference variables (hold a reference to an objects location in memory)
	 * 
	 * 
	 * */
	
	
	// Remember - Java is a statically typed variable - so we need to assign datatype at declaration
	byte b = 127; // 1 byte or 8 bits
	short s = 32767;
	char c = 'c';
	int i = 2147483647;
	long l = 9223372036854775807L;
	float f = 3.4f;
	double d = 688.89;
	boolean bool = false;
	
	
	
	System.out.println(b);
	System.out.println(s);
	System.out.println(c);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(bool);
	
	/*
	 * Casting
	 * 
	 * How we can convert from one data type to another
	 * 
	 * Most conversions must be done explicitly
	 * */
	
	// Note that if casting down (down casting) won't always work. 
	long longNum = 94l;
	int castedInt = (int) longNum;
	
	System.out.println("Casted Int: " + castedInt); // concatenation
	
	// Casting up can be done implicitly - but it's always better to be explicit in your code
	
	long castInt;
	castInt =  i;
	
	System.out.println(castInt);
	
	// int castBool = (int) bool; this won't work
	
//	int myInt = 0;
//	boolean testCast = (boolean) myInt; 
	
	double x = 5.5;
	int y = 3;
	
	int z = (int) (x + y);
	
	
	System.out.println(x+y);
	System.out.println(z);
	
	
	
	
	}

}
