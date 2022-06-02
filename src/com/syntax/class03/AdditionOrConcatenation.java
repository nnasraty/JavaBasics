package com.syntax.class03;

public class AdditionOrConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a=10;
	int b=20;
	
	String c="Hello";
	String d="Hi";
	
	System.out.println(a+b+c+d); // 30HelloHi
	System.out.println(a+c+b+d); //30Hello20Hi
	System.out.println(c+d+a+b); //Hellohi1020 (because java works from left to right) this is considered as String. 
	//Note: jave works from top to bottom and from left to right 
	
	System.out.println(c+d+(a+b)); // HelloHi30 -----> java solves parentheses first.
	
		
	
		
		
		

	}

}
