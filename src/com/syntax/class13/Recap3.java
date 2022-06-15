package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// from a String get the part which starts from the symbol # and ends at the symbol #
		
		String str="I am Confused";
		System.out.println(str.substring(5)); // ignores 5 first indes
		System.out.println(str.substring(2));// ignors first 2 index
		System.out.println(str.substring(2,8)); // ignors first 2 then after 8 indexes
		System.out.println(str.substring(0,3));

		

	}

}
