package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		
		// Declare 2 numbers test if condition and if else
		
		
		int num1 =20;
		int num2=20;
		if(num1>num2)
		{System.out.println(num1+" is larger than "+num2);}
		else if(num2>num1)
		{System.out.println(num1+" is larger than "+num2);}
		else
		{System.out.println(num1+" is equal to "+num2);}
		
		//--------------------------------
		// if....else if block
		// the moment java finds true condition exexutes and leaves the entire is statements.
		
		int day = 4; // we should always change our numbers and test our code. 
		if (day==1) {
			System.out.println("Monday");}
		else if (day==2) {
			System.out.println("Tuesday");}
		else if(day==3) {
			System.out.println("Wednesday");}
		else if(day==4) {
			System.out.println("Thursday");}
		else if(day==5) {
			System.out.println("Friday");}
		else if(day==6) {
			System.out.println("Saturday");}
		else if(day==7) {
			System.out.println("Sunday");}
		
		// This is called if... else if block  and only one gets printed
		/* Task: Create a Java program and declare int variable that will hold a month. 
		Based on the value of the variable your program should print the name of the month.*/
		
		int month = 9;
		if (month == 1) {
			System.out.println("Jan");} 
		else if(month==2) {
			System.out.println("Feb");} 
		else if(month==3) {
			System.out.println("Mar");} 
		else if(month==4) {
			System.out.println("Apr");} 
		else if(month==5) {
			System.out.println("May");} 
		else if(month==6) {
			System.out.println("June");} 
		else if(month==7) {
			System.out.println("july");} 
		else if(month==8) {
			System.out.println("August");} 
		else if(month==9) {
			System.out.println("Sep");} 
		else if(month==10) {
			System.out.println("Oct");} 
		else if(month==11) {
			System.out.println("Nov");} 
		else if(month==12) {
			System.out.println("Dec");} 
		
		
		
					
					
	}
}
					
					
					
					
		

		
		
		
		
		
	
		
		





