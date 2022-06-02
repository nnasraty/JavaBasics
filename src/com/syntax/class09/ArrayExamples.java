package com.syntax.class09;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// I want to store prices in array,
		
		double [] price =new double[4];
		
		price[1]=1.99;
		price[2]=2.99;
		price[3]=3.99;
		
		System.out.println(price[0]);
		
		int[] numbers =new int[3];
		numbers[0]=10;
		numbers[1]=12;
		numbers[2]=12;
		//numbers[3]=13; 
		System.out.println(numbers[1]); /// it shows error because we created 3 box and we are
										/// trying to store 4 element. (if we activate line 22).
		// Arrays are fixed in size
		// during runtime Java cannot increase or decrease a size of an array
		
		
		
		
		

	}

}
