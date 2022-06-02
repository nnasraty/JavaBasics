package com.syntax.class10;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] iceCream =new String[3];
		iceCream[0]=("Vanila");
		iceCream[1]=("Chocloate");
		System.out.println(iceCream[2]); // null the result will be.
		
		//----
		String[]disney= {"Shrek", "Elsa", "Goofy", "Mulan"};
		int size =disney.length;
		
		System.out.println(disney[3]);// will print Mulan
		
		// to get all elements from an array
		for(int i =0; i<disney.length; i++) {
			System.out.print(disney[i]+" "); // prints all of them
			
		}
		System.out.println();
		System.out.println("--------------");
		
		///------------
		for(String character:disney) {
			System.out.println(character+" "); /// prints all elements 
		}
		
		//------------------
		
		System.out.println("------------");
		
		for(String character:disney) {
			System.out.println(character+" "); /// prints all elements 
			if (character.equalsIgnoreCase("Mulan")) {
				System.out.println(character+ " is my favorite character");
			}else {
				System.out.println(character+ " ");
			}
		}
	}
	


}
