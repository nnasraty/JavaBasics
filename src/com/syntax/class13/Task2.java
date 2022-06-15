package com.syntax.class13;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a String and print it in reverse order (Sunday -> yadnus)
		
		
		// we should use reverse loop.
		String str ="Sunday";
		for (int i =str.length()-1;i>=0; i--) { // we subtract -1 form the length to not get error
			System.out.print(str.charAt(i));
		}

	}

}
