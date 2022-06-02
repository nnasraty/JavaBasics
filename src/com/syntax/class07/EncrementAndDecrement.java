package com.syntax.class07;

public class EncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=10;
		x=x+1;
		x+=1;// Shorthand
		System.out.println(x); //12
		
		x++; // Increments value of a variable by 1
		System.out.println(x);//13
		
		x--; // decrements value of a variable by 1
		System.out.println(x); //12
		
		// increment and decrement operators work only with variable
		//10++; CE: invalid argument to operation ++/--
		
		int time =5;
		if(time<12){
				System.out.println("Morning"); //If statement example	
		}
		//---------------------------------------------
		//Loop

		while(time<12){
				System.out.println("Morning"); // infinite times will repeat
				time++;
				}
		// while is similar to if but repeats printing.
		System.out.println("Hello");
		
		
		
		
		
		

	}

}
