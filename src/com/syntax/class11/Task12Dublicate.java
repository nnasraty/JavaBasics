package com.syntax.class11;

public class Task12Dublicate {

	public static void main(String[] args) {
		
			
			// Write a program to print out duplicate elements from an Array of Strings? this is last
			String[] arr= {"AA","D","B","A","B"};
			
			for(int i=0; i<arr.length;i++) {
				
				for(int j=i+1; j<arr.length;j++) {
					
					if(arr[i].equals(arr[j])&& i!=j){
						System.out.println(arr[i]);
					}
				}
			}
		}

	}


