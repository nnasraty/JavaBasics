package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		char choice ='M';
		String meaning;
		
		// variable and marching cases  Must be of same type
		// switch does not allow to have duplicated cases
		
		switch (choice) {
		
		case 'Y':
			meaning ="Yes";
			break;
		case 'M':
			meaning ="Maybe";
			break;
		case 'N':
			meaning ="No";
			break;
		default:
			meaning ="unknown";
		}
		System.out.println(meaning);

	}

}
