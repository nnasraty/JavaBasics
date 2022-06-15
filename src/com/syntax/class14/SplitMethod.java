package com.syntax.class14;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Batch 13 is Grea. Batch 13 is best. Batch 13 is excellent";
		String []arr=str.split("[.]");// [.] adding dot means it splits it from each dots. 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		System.out.println("===============================");
		// Splitting to word to words
		
		String str1 ="Batch 13 is Grea. Batch 13 is best. Batch 13 is excellent";
		String []arr1=str1.split(" ");// [.] adding dot means it splits it from each dots. 
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		System.out.println(arr1[6]);
		System.out.println(arr1[7]);
		System.out.println(arr1[8]);
		
		System.out.println("==============");
		
		//
		String str2="We #love# Java";
		String [] arr2=str2.split("[#]"); // removing #
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

	}

}
