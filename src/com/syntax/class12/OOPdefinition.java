package com.syntax.class12;

//public class OOPdefinition {

	
		// TODO Auto-generated method stub
		
		/* OOP : Object oriented programming is just a way of writing code and classes and objects are
		 * the basic parts of this method.
		 * 
		 * Why we should learn the OOP?
		 * 1. Because OOP simplifies the development of programs
		 * 2. it makes it easy to manage and maintain large programs.
		 * 3. OOP is built around objects classes and many other things which can help us translate
		 *  real life objects into computers.
		 * 
		 * How to write programs using OOP:
		 * 
		 * 1. Create classes inside the classes define properties/fields/attributes to translate how an
		 *    object from real life looks like
		 *    
		 *  3. Create methods/behaviours/functions to define how that thing works in real life.
		 *
		 * NOTE: OOP is also supported in many other programming language like C#, PHP, Python, 
		 * 		Javascript etc...
		 * 
		 */
		// how do we create a class and its object:
	

		
		class Human{
			// attributes/properties/fields (in Java called mostly fields)
			String name;
			int age;
			double weight;
			char gender;
			// method/ function/behaviours (in Java mostly called behaviours)
			void walk() {
				System.out.println("I can walk");
			}
		
		public static void main(String[]args) {
			
			Human sameer = new Human();
			sameer.name="Joker";
			sameer.age=20;
			sameer.weight=90;
			sameer.gender='M';
			sameer.walk();
			
			
		}	
	}


