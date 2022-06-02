package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		// * From an array of integer elements find the largest number.
		// * Create an array to store char values and then print those in reverse order
		
		int[]numbers = {6, 7, 8, 25, 4, 45, 11};
		 int max=numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
			

		}
		System.out.println("The largest element is " + max);
		
		// Or with enhanced loop
		max=numbers[0];
		for(int num:numbers) {
			if(num>max) {
			max =num;
			}
		} 
		System.out.println("The largest element is " + max);
		// Task # 2 Create an array to store char values and then print those in reverse order
		
		char[] values = {'a', 'b', 'c', 'd'}; 
		for(int i = values.length-1; i>=0; i--) {
			System.out.println(values[i]+ " ");
		}
		

	}

}
