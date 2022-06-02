package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		/* lets ask a user where is he from
		 * based on the country we will define favorite food
		 */

		Scanner scan =new Scanner(System.in);
		String country, favoriteFood;
		System.out.println("Please tell me where are you from?");
		
		country = scan.nextLine();
		switch (country) {				//switch(country.toLowerCase()){ or we can switch (country.toUpperCase()){  
		case "Mexico":						// we can switch to lower or upper case but all cases should be lower case too.
			favoriteFood ="taco";			// like canada 
			break;
		case "canada":
			favoriteFood = "poutine";
			break;
		case "Turkey":
			favoriteFood = "pati chai";
			break;
		case "Egypt":
			favoriteFood="koshary";
			break;
		case "USA":
			favoriteFood ="burgers";
			break;
		default:
			favoriteFood="unknown";
		}
		
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);

		
	}

}
