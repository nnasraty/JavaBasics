package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {
		/* switch has a data type limitations
		 * switch can work with byte, short, int, char, String
		 * switch cannot work with doulbe, float ,long, boolean
		 */
		
		double price = 10;
		/*switch (price) {--> CE: cannot switch on a value of type double. 
		}
		*/
		boolean hungry =true;
		/*switch (hungry) { --> CE: Cannot switch on a value of type boolean
		  } 
		 */

		/* switch has a operators limitaitons
		 * cannot use logical operators inside switch
		 */
		
		char choice = 'Y';
		String meaning;
		
		/* switch (choice) { 
		 
		 case 'Y' || 'y': ---CE: cannot use || 
		 meaning = "Yes";
		 break;
		 
		 */
		
		int day =5;
		/* switch (day){
		 * case
		 */
		
	}

}
