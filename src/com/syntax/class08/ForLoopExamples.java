package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		// I need to print numbers from 1  to 90
		
		for(int i =1; i<=90; i++) {
			System.out.print(i+" ");
		}
	/* start
	 * end point
	 * increment/Decrement
	 */
		System.out.println();
		// I need numbers from 60 to 10
		
		for(int i = 60; i>=10; i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
	  //what output is this
		for(int i=5; i<=40; i+=5) {
			System.out.print(i+ " ");
		}
	}

}
