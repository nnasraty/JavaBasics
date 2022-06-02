package com.syntax.class08;

import java.util.Scanner;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		
		//continue - skips current execution / iteration
		
		for(int i=1; i<=5; i++) {
			if(i==2) {
			continue;
			}
			System.out.print(i+ " ");
			System.out.println("Hello");
			System.out.println("We are going on break soon");
		}
		
		//print numbers from 1 to 10 except number 5 and 7
		
		for(int i=1; i<=10; i++) {
			if(i==5 || i ==7) {
				continue;
			}
			System.out.println(i+" ");
		}
		
		//Task - Print number from 1 to 50 except those that are divisible by 3
		
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
			continue;
			}
			System.out.print(i+" ");
			
		}

		//Task2 - Create a program that will keep asking user to apply for a credit card.
		// as soon you get "yes" from user program should stop asking.
		System.out.println();
		Scanner scan=new Scanner(System.in);
		
		String CC;
		
		
		do {
			System.out.println("Did you apply for credit card");
			CC=scan.nextLine();
		}while(!CC.equalsIgnoreCase("Yes"));
			System.out.println(" Good for you");
		}
		

	}


