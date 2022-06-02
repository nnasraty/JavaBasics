package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean job = true;
		double salary = 100000;
		
		if (job && salary>=100000) {
			System.out.println("I am super duper happy");
		}
		
		//------------------
		
		 boolean study = true;
		 boolean homework = true;// if I pick false (else will be printed).
		 boolean practice = true;
		 
		 if (study && homework && practice){
			 System.out.println("You will succeed in the course");
		 }else {
			 System.out.println("You will struggle");
		 }
		 // Write a progr4am to find largest number among three numbers.
		 /* In logical operator and (&&):
		    And && -----> 
			true && true ---- true
			true && false  ---- false
			false && true ----- false
			false && false ---- false
		  */
		
		 int num1 = 65;
		 int num2 = 66;
		 int num3 = 23;
		 
		 if (num1>num2&&num1>num3) {
			 System.out.println(" The largest numbrer is "+num1);
		 }else if(num3 > num1 && num3 > num2) {
			 System.out.println("The largest number is "+num3);
		 }else if(num2 > num1 && num2 >num3) {
			 System.out.println("The largest number is "+num2);
		 }
		 
		
		

	}

}
