package com.syntax.class03;

public class PritmitivesCasting {
	
	//Ctrl+space ----->auto completes

	public static void main(String[]args) {
		
		int i=100;
		double d=100;
		System.out.println(i);//100
		System.out.println(d);//100.0 //widening (automatically)
		
		long l=10000;
		
		// Type dismtach; cannot covert from double to int to byte
		// int x = 99.99 error: can not covert from double to int.
		
		int x=(int)99.99; // narrowing casting (result will come as 99)
		System.out.println(x);
		
		//Byte  b=130; error: can not convert from int to byte.
		
		byte b=(byte)130;
		System.out.println(b);// we get -126
		
		 
		
	}

}
