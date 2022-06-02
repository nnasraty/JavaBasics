package com.syntax.class10;

public class EnhanceforLoopD2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]nums= {{1, 2,3, 4},   {199, 300, 588, 700},  {1900, 4578, 98787}  };
		
		
		 /* enhanced for loop uses variables to access elements from an array
		  * outer for loop --> iterates over 1D array
		  * inner loop --> iterates over elements of each 1D array
		  */
		
		for(int[]num:nums) {
			for(int n:num) {
				System.out.print(n+ " ");
			}
			System.out.println();
		}
		
	}

}
