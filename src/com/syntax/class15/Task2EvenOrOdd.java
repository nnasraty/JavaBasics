package com.syntax.class15;

public class Task2EvenOrOdd {
	// Create a method that will take a number and prints whether the number is even or odd
	
	void printEvenOrOdd(int number){

	    if(number%2==0){
	        System.out.println("Number is Even");
	    }else{
	        System.out.println("Number is Odd");
	    }
	}

	 public static void main(String[] args) {
	     Task2EvenOrOdd task2=new Task2EvenOrOdd();
	     task2.printEvenOrOdd(8);
	 
	
	}

}
