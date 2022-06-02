package com.syntax.class05;

import java.util.Scanner;

public class TaskSanner {

	public static void main(String[] args) {
		
		/*You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, 
		 * otherwise you will offer them to get a learners permit.
			2. Create a Java program that will ask if user has a credit card or not.
			 If you user does not have a credit card then offer them.
			 If they do have one ask what is balance on the card? 
			 If balance of the card is larger than 1000, tell them to pay off immediately,
			  otherwise you can tell them that they can spend more.
		
		 */
		//Task 1
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		
		if (age>=18) {
			System.out.println("If you are older than "+age+ " you will be issued a driver license");
		}else {
			System.out.println("You need to get a permit first");
		}
		//Task 2
		
	
		
		System.out.println("Enter if costumer has a credit card? YES or No");
		String answer = scan.next();
		
		if (answer.equals("no")) {
			System.out.println("We will offer you a credit card");
		}else {
			System.out.println("What is the balance on the card");
			int balance = scan.nextInt();
			if(balance>100) {
				System.out.println("Pay it off immediatly");
			}else {
				System.out.println("You can spend more");
		}
		
		
		
		

		}}

	}


