package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		/* Store username, password and confirm password from a user and check following requirements:
		Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
		Password should be minimum 8 characters, if less → message=”Password is too short”.
		Password cannot contain username if so, → message=”Password cannot contain username”.
		Password should match confirmed password, if not  → message=“Passwords do not match”.
		Only after all requirements met → message “Your username and password has been created”*/
		
		String userName= "admin";
		String passWord = "Password1234";
		String correctPassword = "Password1234";
		
		
//		System.out.println(userName.isEmpty());
//		System.out.println(passWord.length());
//		System.out.println(userName.contains(passWord));
//		
		System.out.println(correctPassword.equals(passWord));
		
		if(userName.isEmpty()|| passWord.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else if(passWord.length()<8){
			System.out.println("Password is too short");
		}else if(passWord.contains(userName)) {
			System.out.println("Password cannot contain username");
		}else if(!passWord.equals(correctPassword)) {
			System.out.println("password do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
		
		

	}

}
