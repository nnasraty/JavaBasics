package com.syntax.class15;

public class Task5 {

	/* Create a method createEmail(). Based on values of user name, LastName
	 *  and email type, your method should return complete email Address. 
	 *  Example: creatEmail(John, Snow, gmail) -> johnsnow@gmail.com
	 * 
	 */
	
	String completeEmail(String firstName, String lastName, String emailType) {
		return firstName+lastName+"@"+emailType+".com";
		
	}
	
	public static void main(String[]args) {
		Task5 task=new Task5();
		System.out.println(task.completeEmail("Tara", "Sitara", "gmail"));
	}
}
