package com.syntax.class07;

public class Dowhile {

	public static void main(String[] args) {
		
		// While loop first checks condition and only then execute block of code.
	

		int num1 =1;
		
		do {					// condition is true it will print the whole repetition. 
			System.out.print(num1+ " ");
			num1++;
		}while (num1 <=3);
		
		//--------------------
		
		// DO while loop first executes the code and only then checks the condition.
		
			int num2 =10; // 10 is bigger than 3 so condition is false.
		
			do {						// DO only lets one time print if condition is false
			System.out.print(num2+ " ");
			num2++;
			}while (num2 <=3);
		
		// print numbers 1 to 30 using do while
			System.out.println();
			
			int a = 1;
			do {
				System.out.print(a+" ");
				a++;
			}while (a<=30);
		
			// Print from 70 to 30 only even
			System.out.println();
			int b = 70;
			do {
				System.out.print(b+" ");
				b-=2;
			}while (b>=30);
		
			
			
	
	}
	// Print from 70 to 30 only even


}
