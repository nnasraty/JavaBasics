package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=3; i++) {			//Outer loop
			System.out.println("Hello");
			
			for(int y=1; y<=2; y++) {		// inner loop
				System.out.println("Bye");
			}
		}
		System.out.println("----");
		///
		for(int i=1; i<=3; i++) {
			System.out.println(i);
			
			for(int y=1; y<=2; y++) {
				System.out.println(y);
			}
		}
		System.out.println("----");
		/////----------
		for(int i=1; i<=3; i++) {
			
			
			for(int y=1; y<=2; y++) {
				System.out.println(i+" "+y);
			}
		}
		System.out.println("-------");
		
		/////
		for(int i=1; i<=3; i++) {			//Outer loop
			System.out.println("Hello");
			
			for(int y=1; y>=2; y++) {		// inner loop
				System.out.println("Bye");// falls condition doestn enter inner loop
			}
		}
		
		System.out.println("-------");
		
		/////
		for(int i=1; i>3; i++) {			// Falls condition doesnt execute 
			System.out.println("Hello");
			
			for(int y=1; y<=2; y++) {		// inner loop
				System.out.println("Bye");
			}
		}
		
		
	}

}
