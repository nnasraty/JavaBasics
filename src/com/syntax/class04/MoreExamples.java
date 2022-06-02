package com.syntax.class04;

public class MoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// in boolean we dont need to use ==, > etc cuz in boolean we assign true or false.
		boolean mothersDay=true;
		if(mothersDay) {
			System.out.println("Happy mothers Day");
		}else {System.out.println("Hello");}
		
		
		boolean rain = false;
		if(rain) {
			System.out.println("I will by an umbrealla");
		}else {System.out.println("No need for umprella");}
		
		// write a program to check wether number is positive or negative
		
		int num = 0;
		
		if(num>0) {System.out.println("The number is positive");}
		else if(num==0) {
			System.out.println("The number is neither positive nor negative");
		}else {System.out.println("The number is negative");}
		//----------------------------------------------------
		String browser ="chrome";
		if (browser.equals("chrome")) {
			System.out.println("All test cases will be executed");
			
		}else {
			System.out.println("I am not exectuing any test cases");
			System.out.println("Reason_wrong browser");
		}
		
		
		
	
		
		
		
	
	

	}

}
