package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/* Write a program to ask user to enter numbers of worked years and annual salary.
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		 * otherwise bonus=3000.
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many years did you work:");
		int workedYears =input.nextInt();
		
		System.out.println("How much was your annual salary:");
		double annualSalary=input.nextDouble();
		
		
		if(workedYears>=5 && annualSalary>50000) {
			System.out.println("Employee is eligible for bonus and Bonus is = 5000");
			
		}else if(annualSalary<50000 && workedYears >= 5) {
			System.out.println("Emplyee is eligible for bonus and it is 3000");
			
		}else {
			System.out.println("Employee is not eligible");
		}
		
		
		
		
		
	}

}
