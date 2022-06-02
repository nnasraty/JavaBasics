package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/* 1. You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money 
		 * otherwise you would reject the client.
		 */
		Scanner scan =new Scanner(System.in);
		
		int loan = scan.nextInt();
		
		if (loan <=200000) {
			System.out.println("I will lend the money");
		}else {
			System.out.println("I will reject the client");
		}
		
		/* 2.Create a Java program that will ask user to input city and temperature.
		 *   Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */
		
		System.out.println("City");
		String city = scan.next();
		System.out.println("Temperature");
		int temp = scan.nextInt();
		int celsius =(temp-32)*5/9;
		System.out.println("The temperature in "+city+ " is "+temp);
		
		
	}

}
