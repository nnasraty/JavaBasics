package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
	// boolean
		boolean vaccine=true;
		int dose =1;
		
		if(vaccine) {		//If main or outer code (if) is false the whole nested will be ignored by java.
			System.out.println("let me check how many doses u got");
			if (dose==1) {
				System.out.println("you need 1 more shot");
			}
		}
		boolean vaccine1=false;
		int dose1 =2; // did not print because of doses do not match,
		
		if(vaccine1) {
			System.out.println("let me check how many doses u got");
			if (dose1==1) {
				System.out.println("you need 1 more shot");
			} else
				System.out.println("You are fully vacinated");
		}
		
		boolean vaccine2= true;
		int dose2 =2;
		
		if(vaccine2) {
			System.out.println("let me check how many doses u got");
			if (dose2==1) {
				System.out.println("you need 1 more shot");
			}
		}
		
		//=====================================
		// String:
		
		String month="May"; // if i change the month there will no any outcome. 
		int day=8;
		if(month.equals("May")) {
			System.out.println("Let me check what is today's date");
			if (day==8) {
				System.out.println("Today is a mother's day");
			}
		}
		
		String month1="June";  
		int day1=19;
		if(month1.equals("May")) {
			System.out.println("Let me check what is today's date");
			if (day1==8) {
				System.out.println("Today is a mother's day");
			} 
		}else if(month1.equals("June")) {
			System.out.println("Let me check day in June");
			if(day1==19) {
			System.out.println("It is father's day");
		}
		}	
	}
}
	

	


