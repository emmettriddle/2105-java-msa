package com.revature.strings;

public class StringPlayground {
	
	public static void main(String[] args) {
		
		// Strings are Objects in Java
		// Strings are NOT mutable
		// There are two ways to create a string
		
		// String literal
		String s1 = "Hello";
		
		String s2 = new String("Hello");
		
//		System.out.println(s1);
//		System.out.println(s2);
		
		// charAt()
		System.out.println(s1.charAt(0));
		
		// indexOf()
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.lastIndexOf('l'));
		
		// length()
		System.out.println(s1.length());
		
		// substring()
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 3)); // does not include character at ending index
		System.out.println(s1.substring(2, 4));
		
		
		// equals()
		System.out.println("s1.equals(s2) " + s1.equals(s2)); // true
		
		/** NOTE: With Strings == is not the same as equals() **/
		System.out.println("s1 == s2" + s1 == s2); // false
		
		String s3 = "Hello";
		
		System.out.println("s1 == s3" + (s1 == s3));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		String name = "Dan";
		String str = String.format("Hello my name is %s", name);
		
		System.out.printf("Hello, %s, it's nice to meet you.", name);
		
		System.out.println(str);
		
		
		// StringBuilder - an object that manipulates Strings - basically to make them mutable
		
		StringBuilder sb = new StringBuilder("My name is Dan.");
		
		System.out.println(sb);
		
		sb.append(" Nice to meet you.");
		
		System.out.println(sb);
		
//		
//		String greeting = "My name is Dan.";
//		
//		String g2 = greeting + " Nice to meet you.";
		
		String sub = sb.substring(10);
		
		System.out.println(sub);
		
		int index = sb.indexOf("N");
		System.out.println(index);
		
		sb.replace(0, sb.indexOf("N"), "");
		
		System.out.println(sb);
		
		// StringBuffer - thread safe version of the StringBuilder
		
	}
	
	
	
	

}
