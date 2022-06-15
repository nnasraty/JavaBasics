package com.syntax.class13;

public class stringDifinition {

	public static void main(String[] args) {

	/*
	 * String Class:
	 * is used to store and manipulate character based data like numbers, Alphabets
	 * and special characters.
	 * 
	 * methods:
	 * length();
	 * String str=new String("Hold your horse for IntelliJ");
	 * String => DataType/Class
	 * str => variable name/ object/ instance
	 * = => is assignment operator
	 * new  => is used to create objects
	 * String();  it is also like method it contains some java statements which are executed 
	 * 				when object of this class is created, it is called constructor.
	 * METHODS:
	 */

		String str="Batch 13 is great but i say this to every batch.i was kidding";
		
		System.out.println(str.length());
		int len=str.length();
		//System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		str=str.toUpperCase();
		System.out.println(str);
		str=" ";
		System.out.println(str.isEmpty());
		
		String str2 =" Tara      ";
		System.out.println(str2.trim());  // trim => removes spaces
		
		str="Batch 13 is great but i say this to every batch.i was kidding";
		System.out.println(str.contains("batch")); // true
		System.out.println(str.startsWith("Batch"));//
		System.out.println(str.endsWith("ing"));
		
		
		
		
	}

}
