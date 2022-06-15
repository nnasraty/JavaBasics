package com.syntax.class16;

public class VariablesDifinition {

	/* There are are three types of variales in java local instance static.
	 * Local Variables:
	 * 	Are the variables which are created inside a block of code like method, loop switch
	 * statement if else condition or a constructor.
	 * 
	 *  Advantages:
	 *  We should always prefer local variables to instance or static variables. Because
	 *  they live for the shortest period of time inside your RAM.
	 *  Disadvantages:
	 *  
	 *  	They can't be accessed outside of the block of code in which they are created.
	 *  class Countries{ 
	 *  
	 *  Void USA(){
	 *  String preson = "Elisa Bro";
	 *  }
	 *  
	 *  void Russia(){
	 *  System.out.println(person) // we will get an error because right now Person is only 
	 *  accessible in USA method
	 *  }
	 *  }
	 *  
	 *  2. Instance Variables:
	 *  
	 *  	They are created inside the class  but outside a block of code.
	 *  Advantages:
	 *  Instance variables are accessible everywhere in a class in all the block of code
	 *  inside that class but not in a static method.
	 *  
	 *  Disadvantages:
	 *  	They keep on occupying the memory for longer periods of time.
	 *  
	 *  3. Static variables:
	 *  	If we have a instance variable with a static keyword then it is callsed as static variable
	 *  
	 *  Advantages:
          They have the highest scope available even outside an object
    	  and are class level variables that's why it does not matter how many
    	  objects we create from that class only one variable is  created;
          If we know that a value will stay same for all the objects of a class
          we should always go with static variable that way we can save a lot of memory

          DisAdvantages:
          They occupy the memory for longest period of time
          They can hold only a single value for all the objects.

	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 * 
	 */
	
	
}
