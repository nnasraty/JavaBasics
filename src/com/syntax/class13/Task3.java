package com.syntax.class13;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 
		//or more characters, print the character in the middle of the String.
		
		String father="Sameer";
		String mother="Taylor swift";
		boolean boy=false;  //if true boy otherwise girl
		
		if(boy) {
			String firstHalf=father.substring(0,father.length()/2);
			String secondHalf=mother.substring(mother.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim());
		}else {
			String firstHalf=mother.substring(0,mother.length()/2);
			String secondHalf=father.substring(father.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim());
		}
		

	}

}
