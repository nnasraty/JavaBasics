package com.syntax.class02;

public class VariablesPractice {

	public static void main(String[] args) {
		/* In your program create different type of variables to store student’s information(name, last name, 
	grade, city, state, phone number) and then print value of those variables in the format:
	My name is ___ and my last name is ____
	I am A/B student
	I live in city__ and state____
	And my phone number is …..
	b) Change student’s city, state, phone number and grade. And print those updated values:
	Example:
	My name is __ and I moved to new city__ and new state__. My new phone number is 
		 */
	//Task A:	
		String name = "Noor";
		String lastName = "Nasraty";
		String grade = "C";
		String city = "NY";
		String state = "NY";
		String phoneNumber = "123-454-0987";
		
		
		
	//Task B:
		
		name = "John";
		lastName = "Sproch";
		grade = "A";
		city = "Austin";
		state = "TX";
		phoneNumber = "098-765-5432";
		
		System.out.println("My name is " + name +" and my last name is " + lastName+ "."  );
		System.out.print("I live in " + city +" city and " + state+ "."  );
		System.out.println(" And my phone number is: " + phoneNumber   );
		
		
		
		

	}

}
