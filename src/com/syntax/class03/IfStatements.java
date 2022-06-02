package com.syntax.class03;

public class IfStatements {

	public static void main(String[]args){
		
		/* 
		 * declare a variable rate.
		 * If rate is more than 5---> I am not buying a house
		 */

		double mortgageRate=5.5;
		if (mortgageRate>5) { System.out.println("I am not bying a house");} // the statement(condition) is true it prints it
		
		double mortgageRate1=4.5;
		if (mortgageRate1>5) { System.out.println("I am not bying a house");} // the statement(condition) is false didnt print.
		
		// Declare 2 variables and check if num1 is bigger than num2
		
		int num1=100;
		int num2=99;
		
		if(num1>num2) {System.out.println(num1+" is bigger than "+num2);} // the statement(condition) is true it prints it
		
		int temp=68;
		if(temp>75)
		{System.out.println("I will go for a walk");} else {System.out.println("I am going to study java");}
		// otherwise. code comes to else {} when the condition is flase. 
		// if i change temp to higher number the condition becomes true then it will print "I will go for a walk" 
		// but it won't print " I am going to study Java".
		
		char gender='f';// with char we use ==
		if (gender=='f')
		{System.out.println("You like shopping");}else {System.out.println("You like watching sports");}
		
		String browser="chrome"; // for string we us .equals
		if(browser.equals("chrome")) {System.out.println("All test cases will be executed on chrome");}
		else {System.out.println("I am not executing any test cases");}
		
		// Task
		
		int grade = 40;
		int grade2 = 50;
		if (grade>grade2)
		{System.out.println("If grade is higher than "+grade2+" I will pass the test ");}
		else {System.out.println("I will fail the test");}
		
		
		int temp1=20;
		if(temp1<32)
		{System.out.println("Water will freeze with temperature "+temp1);}
		else {System.out.println("Otherwise water will not freeze with temperature "+temp1);}
		
		
		
		
		
		
	}
	}
	
	

