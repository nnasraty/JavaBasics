package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1 = 40;
		int num2 = 20;
		
		int sum, sub, mult, div; 
		
		System.out.println(num1/num2);
		
		sum = num1+num2;
		System.out.println(sum);
		
		sub=num1-num2;
		System.out.println(sub);
		
		mult=num1*num2;
		System.out.println(mult);
		
		div = num1/num2;
		System.out.println(div);
		
		// ................
		// sum, sub, multi ... are assigned to Int that is why we assign for double sum1, sub1, multi1 and ...
		
		
		double num3=9.99;
		double num4=3.50;
		
		double sum1, sub1, mult1, div1;
		sum1=num3+num4;
		
		System.out.println(sum1);
		
		/////////////////////////////////
		
		int a =10;
		int b=3;
		
		int result = a/b;
		System.out.println(result); // gives us 3 whole number because int always gives us whol number 
		
		///////////
		double c = 10.0;
		double d = 3.0;
		
		double result2 = c/d;
		
		System.out.println(result2); // it gives us 3.3333333333335 because the result comes as double. that is why we used double.
		
		////////////
		float e = 10.0f;  // we add f to assign value as float. 
		float f = 3.0f;
		
		float result3 = e/f;
		System.out.println(result3); /////// only gives us 3.3333333 not complete decimal result. 
		
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
