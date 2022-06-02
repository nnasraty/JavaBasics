package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean boo =!true; // ! changes is to false
		System.out.println(boo);
		
		boolean boo1 = !false; // the output will be true. 
		System.out.println(boo1);
		
	// if there is no traffic --->> I will reach work on time
		
		boolean traffic = false; // by adding ! we change the false to true.
		if (!traffic) {
			System.out.println("I will reach work on time");
		}
		
		String name="Reza";
		
		if (!name.equals("Emre")) {
			System.out.println("you are not Emre, I need emre");
		}

	}

}
