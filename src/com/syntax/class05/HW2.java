package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/* 2.Create a Java program that will ask user to input city and temperature.
		    Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("City name:");
		String city = scan.next();
		
		System.out.println("What is the temperature");
		int temp = scan.nextInt();
		
		int celsius =(temp-32)*5/9;
		System.out.println("The temperature in "+city+ " is "+celsius);
		
		
		

	}

}
