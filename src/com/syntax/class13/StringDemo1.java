package com.syntax.class13;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Batch 13 is good actually very good";
		String str2= "234324344";
		System.out.println(str.replace("good", "Great"));
		System.out.println(str.replace("g","G"));
		System.out.println(str.replaceFirst("g", "G"));
		System.out.println(str.replace(str, str2));

	}

}
