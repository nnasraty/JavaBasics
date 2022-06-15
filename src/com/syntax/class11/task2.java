package com.syntax.class11;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// Using Scanner create an array of countries
		// when an array is created, retrieve all values from it
		//and while retrieving those values print capital for each country. 
		
		Scanner scanner =new Scanner(System.in);
		 System.out.println("Please enter the size of the array that you want to create");
		 int arraySize=scanner.nextInt();
		 String []countryArray= new String [arraySize];
		 
		 for(int i=0; i<countryArray.length;i++) {
			 countryArray[i]=scanner.next(); 
		 }
		 
		 for (String element:countryArray) {
			 if (element.equalsIgnoreCase(element))
			 System.out.println("Washington DC");
			 
		 }

	}

}
