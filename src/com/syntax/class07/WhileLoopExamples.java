package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// Print 1 to 10
		
		int num=1;
		
		while(num<=10){
			//num++;in here we will get 2-11
			
			System.out.print(num);
			num++; // we get only 1-10
		}
		
		
		// Print numbers 10 to 100
		System.out.println();
		
		int a =10;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
			// print 10 to 1;
			System.out.println();
			
			int b=10;
			while(b>=1) {
				System.out.print(b);
				b--;
			}
		
		// Print 100 to 50
			
			System.out.println();
			int c=100;
			while(c>=50) {
				System.out.print(b);
				c--;
			}
	// from -1 to -10
			System.out.println();
			
			int d=-1;
			while(d>=-10) {
				System.out.print(d+ " ");
				d--;
			}
			
			// Print 1 to 20 only even numbers
			System.out.println();
			// 1 way
			
			int e = 2;
			while (e<=20) {
				System.out.print(e);
				e+=2;
			}
			
			// 2nd way
			System.out.println();
			
			int f=1;
			while(f<=20){
				if(f%2==0) {
					System.out.print(f+ " ");
				}
				f++;	
			}
			// print even numbers from 20 to 100
			System.out.println();
			
			int g = 20;
			while (g<=100) {
				System.out.print(g+ " ");
				g+=2;
			}
			
			// Print only odd numbers from 100 to 1
			System.out.println();
			int h = 100;
			while (h>=1) {
				if(h%2!=0) {
				System.out.print(h+ " ");
				}
				h--;
			}
			// another way
			System.out.println();
			int i = 99;
			while (i>=1) {
				System.out.print(i+ " ");
				i-=2;
			}
			

	}
	

}
