package com.syntax.class10;

public class HWArray {

	public static void main(String[] args) {
		// create an array to steor double values and then print all elemtns 
		
		double[] num = {2.99, 3.99, 4.99, 5};
		
		for( double x : num) {  // Enhanced for loop wit Array
			System.out.print(x+ " ");
		}
		
		
		System.out.println();
		for (int i = 0; i<num.length; i++) {
			System.out.print(num[i]+ " ");
		}
		
		// Create an array on intigers and calculate the sum of all elements  in an array
		System.out.println();
		
		int[] numbers = {10, 222, 3, 4, 5};
		int sum =0;
		for (int i=0; i<numbers.length; i++) {
			sum=sum+numbers[i];
		}
		System.out.println("Sum of all elements = " +sum);
		
	// OR Shorter way with enhanced for loop (only wit Arrays we can use enhanced for loop)
		sum =0;
		for (int n:numbers) {
			sum+=n;
		}
		System.out.println("Sume of all elements = "+sum);
	}

}
