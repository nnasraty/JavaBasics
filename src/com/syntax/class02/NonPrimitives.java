package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		
		String name = "Oleg";
		String lastName = "Smith";
		
		long phone = 1233456789l; // xxx-xxx-xxxx
		String phoneNumber = "123-456-7890";
		String address = "123 Washingon st";
		
		String age = "10"; 
		
		// Shortcut for printing ( syso+ctrl+sapce ---> hit enter
		
		/* we can use + 		---> works as concatenation operator
		 * 				to attache string to string
		 * 				to String to int
		 * 				to attach double 
		 * 				to attach any other type
		 */
		System.out.println(name + lastName);  // Oleg Smith
		// we need to add space
		
		System.out.println(name +" "+lastName);
		// Oleg lives in Miami
		String city = "Miami";
		System.out.println(name+ " lives in "+city);
		
	// Oleg is 30 years old
		 age = "30";
		
		System.out.println(name+ " is " + age +" years old");
		
		/* Ruels for identifiers
		 * 1. no space
		 * 2. no keywords
		 * 3. can not start with number (numbers can be used in the middle or end)
		 * 4. can not have special characters (except _ , $)
		 * 
		 */
			
		
		//int 1number = 10; error
		int number1 = 10;
		
		// int num% =20; error
		double $price =3.99;
		float f_ = 2.09f;
		
		/* Naming conventions:
		 * follow camelCasing
		 * variables/methods names should start with lower case and then follow upper case
		 * class names should start with upper case
		 */
		
		
		
		
		
	}

}
