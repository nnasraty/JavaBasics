package com.syntax.class09;

public class ArrayTask {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,F. then print
		// a grade B (use 2 differnt ways of creating an array).
		
		{char [] grades = new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		}
		// another way
		char[] grades = {'A', 'B', 'C', 'D','E', 'F'};
		System.out.println(grades[1]);
		// OR To print all
		for (int i=0; i<grades.length; i++) { //we shouldnt use = for array length.
			System.out.print(grades[i]+ " ");
		}
		System.out.println();
		// Task 2 Create an array or words: Java, Saturday, day, coding, is. Print the
		// teh following sentece using elemetns of array: "Saturday is Java coding day".
		
		String[]words = new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+ " "+words[2]+".");
		
		
	}

}
