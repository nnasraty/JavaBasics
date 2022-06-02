package com.syntax.class10;

public class AnotherWayOf2dArray {

	public static void main(String[] args) {
		// create 2D array of States.
		// 1 array --> NY ---> all cities of NY State
		// 2nd array ---> CA ---> all cities of CA state
		// 3rd array --> FL ---> all cities of FL State
		// 4th array ---> VA ---> all cities of VA state
		
		String [][] usa= {
				
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}
			
		    };
		System.out.println(usa[1][2]);// San Jose
		System.out.println("I want to go to "+usa[2][0]);// Miami
		
		System.out.println("Total # of 1D arrays in usa ="+usa.length); // 4
		
		// I want to see how many elements inside my 1st array
		
		int elem1array =usa[0].length;
		System.out.println("Elements of my 1st array ="+elem1array);// 3
		
		// I want to see how many elements inside my 2nd array
		
		int elem2array =usa[1].length;
		System.out.println("Elements of my 1st array ="+elem2array);// 5
		
		// Using for loop
		System.out.println("--------");
		
		
		for(String[]state:usa) {
			for(String city:state) {
				System.out.print(city+ " ");
			}
			System.out.println();
		}
		
		
	
		
	}

}
