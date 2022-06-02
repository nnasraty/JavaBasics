package com.syntax.class08;

public class ForLoopIntro {

	public static void main(String[] args) {
		// I want to say good morning 5 times
		
		for(int i=1; i<=5; i++ ) {
			System.out.println("Good morning");
		}
		//---------------------------
		for(int i=1; i<=5; i--) {
			System.out.println("Hello"); // we will get infinite print
		}
		
		// ------------------------------------------
		for(int i=1; i>=5; i++ ) {
			System.out.println("Hello"); // prints 5 times
		}
		
		//---------------------------
		for(int i=1; i>=5; i++) {
			System.out.println("Hello"); // 0 times print
		}
		
		
		
	}

}
