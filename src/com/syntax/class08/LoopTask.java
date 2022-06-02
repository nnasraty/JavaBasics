package com.syntax.class08;

public class LoopTask {

	public static void main(String[] args) {
		// task1 print 1 to 100
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}

		// Task2 print 100 to 1
		System.out.println();
		
		for(int i=100; i>=1; i--) {
			System.out.print(i+ " ");
		}
		
		// Task 3 Print even numbers from 20 to 1
	    System.out.println();
		
		for(int i =20;i>=1; i-=2) {
			System.out.print(i+" ");
	       }
		// another way
		System.out.println();
		
		for(int m=20; m>=1; m--) {
			if (m % 2 ==0) {
				System.out.print(m+ " ");
			}
		}
		System.out.println();
		
		// Task 4 Print odd numbers
		for(int i =21; i<=50; i+=2) {
			System.out.print(i+ " ");
		}
		System.out.println();
		// another way
		for(int i=20; i<=50; i++) {
			if (i % 2 !=0) {
				System.out.print(i+ " ");
			}
		}
		
		
	}


}
