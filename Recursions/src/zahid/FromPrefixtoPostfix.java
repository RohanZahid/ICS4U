package zahid;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
/**
* FromPrefixtoPostfix.java
* Converts expressions inputted in prefix notation into postfix notation and outputs them.
* Feb 28, 2018
* @author Rohan Zahid
**/
public class FromPrefixtoPostfix {
	/**
	 * The main method asks the user for a prefix expression, replaces all spaces in the input, passes the input to postfix(String str) and outputs what is returned.
	 * @param args
	 * unused
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the arithmetic prefix expression-> "); //Prompts the user for a prefix expression.
		String str = scan.nextLine(); //Saves the input in a variable called str.
		boolean play = true; //Assigns a boolean value of true to play. This will be used to determine if a 0 was inputted.
		do {
			str = str.replaceAll(" ", ""); //Replaces all spaces in str.
			System.out.print(postfix(str)+"\n"); //Prints what is returned from the postfix method and inserts a newline in the text at this point.
			str = scan.nextLine(); //Saves the next input in str.
			if(str.equals("0")) //If str equals 0, play is given the boolean value of false.
				play = false;
		}
		while (play == true); { //Repeats the do segment if play is equal true.
			System.out.print("Done."); //If play does not equal true, "Done." is outputted.
		}
		
	}
	/**
	* Rearranges the prefix expression to make it postfix and returns it with spaces.
	* @param str
	* The String that is going to be rearranged.
	* @return
	* The expression in postfix notation.
	**/
	private static String postfix(String str) { 
		if ((str.charAt(0)!= '-') && (str.charAt(0)!= '+')) { //If str.charAt(0) is a digit, str.charAt(0) is returned because there are no operators.
			return str.charAt(0) + ""; //Since the return type is String and str.charAt(0) is a char, + "" makes it a String.
		}
		else {
			String opd1 = postfix(str.substring(1, operandHelp(str))); //A string called opd1 is given the substring of str from 1 to the return of operandHelp(str).
			String opd2 = postfix(str.substring(operandHelp(str))); //A string called opd2 is given the substring of the return of operandHelp(str) to the end of str.
			return opd1 + " " + opd2 + " "  + str.charAt(0) + " "; //Returns the string of opd1 + opd2 + str.CharAt(0) to rearrange the order. + " " adds spaces in between each digit or operator. 
		}
	}
	/**
	* Finds and returns one more than the location of where the number of operands is more than the number of operators.
	* @param str
	* The input from the user.
	* @return
	* One more than the location of where operands is greater than operators.
	**/
	private static int operandHelp(String str)  {
		int operator = 0; //Assigns the value of 0 to a variable that holds the number of operators (i.e + and -).
		int operand = 0; //Assigns the value of 0 to a variable that holds the number of operands (i.e 2).
		for (int i = 1; i < str.length(); i++) { //A for loop starting from 1 is created. Goes through when i is less than the length of str. i increases by 1 each loop. 
			if((str.charAt(i)!= '-') && (str.charAt(i)!= '+')) //If str.charAt(0) is a digit, operand is increased by 1 because there are no operators.
				operand++;
			
			else  //operator is increased by 1.
				operator++;
			
			if (operand > operator) //When operand is greater than operator, i + 1 is returned because the location of one more than the current char needs to be returned. 
				return i+1;
			
		}
		return 1; //If the for loop is exited without a value being returned, 1 is returned.
	}


}