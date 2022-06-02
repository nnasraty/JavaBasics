package com.syntax.class05;

import java.util.Scanner;

public class UserInputPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter name");
		
		String name=scan.next(); //capture String
		
		System.out.println("please enter age");
		int age =scan.nextInt(); // capture int
		
		System.out.println("please enter price");
		double price=scan.nextDouble();// capture double
		
		System.out.println("Please enter boolean");
		boolean boo=scan.nextBoolean();// capture boolean
		
		System.out.println("Please enter any character");
		char character= scan.next().charAt(0);//capture 1 character
		
		
		
		
		
		

	}

}
