package com.syntax.class08;

public class LoopSumPractices {

	public static void main(String[] args) {
		// 
		int sum =0;
		for(int i=1; i<6; i++) {
			
			System.out.println(sum);//0 1 3 6 10
			sum+=i;
			System.out.println(sum);/// 1 3 6 10 15 
		}
		System.out.println(sum); // 15
		
		/* Task
		 * Write a program to find sum of all even and all odd numbers from 1 to 70
		 */
		// sum of even numbers
		int sum1 =0;
		for (int i=1; i<=70; i++ ) {
			if(i%2==0) {
				sum1+=i;
			}
		}
		System.out.println("Sum of all even numbers equals to "+sum1);
		
		//// sum of odd numbers
		int sum2 =0;
		for (int i=1; i<=70; i++ ) {
			if(i%2!=0) {
				sum2+=i;
			}
		}
		System.out.println("Sume of all odd numbers equals to "+sum2);
		
		
	// ANOTHER WAY
		
		int sumEven=0;
		int sumOdd =0;
		for (int i=1; i<=70; i++ ) {
			if(i%2==0) {
			sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		
		System.out.println("Sum even numbers is "+sumEven);
		System.out.println("Sum odd numbers is "+sumOdd);
		
		
		
	}

}
