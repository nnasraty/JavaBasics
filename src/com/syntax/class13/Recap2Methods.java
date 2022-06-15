package com.syntax.class13;

public class Recap2Methods {

	public static void main(String[] args) {
		//
		
		String str ="Where is sameer?";
		System.out.println(str.charAt(3)); // charAt finding singular number or letter location.
		System.out.println(str.charAt(7));
		
		System.out.println(str.indexOf("i")); // indexOf => finds indexes.
		System.out.println(str.indexOf("e")); // finding first "e"
		// what we find the next "e"
		System.out.println(str.indexOf("e",6)); // ignores the fist 6 letters(index)
												// and starts search after 6th
		
		// Or using counter to find location of an index.
		
		int counter=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e') { 
				counter++;
				if(counter==3) {// 3 shows which 'e' we are looking from left to right.
					System.out.println(i);
				}
			}
		}
		
		
				
				

		
	}

}
