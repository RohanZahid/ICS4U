import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class FromPrefixtoPostfix {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the arithmetic prefix expression-> ");
		String str = scan.nextLine().replaceAll(" ", "");
		for (int i = 0; i < postfix(str).length(); i++) {
			System.out.print(postfix(str).charAt(i) + " ");
		}
	}

	private static String postfix(String str) { 
		if ((str.charAt(0)!= '=' && str.charAt(0)!= '+')) {
			return str.charAt(0) + "";
		}
		else {
			return postfix(str.substring(1, operandHelp(str))) + postfix(str.substring(operandHelp(str))) + str.charAt(0);
		}
	}

	private static int operandHelp(String str)  {
		int operator = 0;
		int operand = 0;
		for (int i = 1; i < str.length(); i++) {
			if((str.charAt(i)!= '=' && str.charAt(i)!= '+')) 
				operand++;
			
			else 
				operator++;
			
			if (operand > operator) 
				return i+1;
			
		}
		return 1;
	}


}
