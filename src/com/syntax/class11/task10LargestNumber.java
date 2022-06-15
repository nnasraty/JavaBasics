package com.syntax.class11;

import java.util.Arrays;

public class task10LargestNumber {

	public static void main(String[] args) {
		// write a java program to find the second largest number in the array?
		
		int [] arr= {10,400,5,6,8,300,200};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // sorts the array from small to large
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);// 
		System.out.println(arr[arr.length-2]);

	}

}
