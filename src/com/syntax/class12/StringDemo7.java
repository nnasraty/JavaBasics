package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		// finding index in sentence for example d the 19th letter in the sentence.
		
		String str = "I am always confused";
		System.out.println(str.indexOf("am"));
		System.out.println(str.indexOf("always"));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('d'));
		System.out.println(str.indexOf(' '));

	}

}
