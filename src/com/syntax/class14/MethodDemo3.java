package com.syntax.class14;

public class MethodDemo3 {

	public static void main(String[] args) {
		// 
		MethodDemo3 md=new MethodDemo3();
		System.out.println(md.checkString("Hello"));
		
		
	

	}

boolean checkString(String str) {
		
		if(str.length()%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
