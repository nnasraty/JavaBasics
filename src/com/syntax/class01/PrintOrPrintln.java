package com.syntax.class01;

public class PrintOrPrintln {

	public static void main(String[] args) {
		// see difference between println vs print
		
		
		System.out.println("hello");
		System.out.println("How are you");
		System.out.println("I am learning coding");
		
		System.out.print("hello");
		System.out.print("How are you");
		System.out.print("I am learning coding");
		
		
		/*
		 * Spaces matter only inside " "
		 * Spaces doesnt matter anywhere els since they will be treated
		 * as whit spaces - ignored
		 */

		System.out.print("hello    ");
		System.out.print("How are you    ");
		System.out.print("I am learning     coding");
		
		
	}

}
