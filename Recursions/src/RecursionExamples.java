
import java.util.Scanner;

public class RecursionExamples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String n = sc.nextLine();
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//long n = sc.nextLong();
		//System.out.println(factorial(n));
		//System.out.println(sum(n));
		//System.out.println(exponent(a,b));
		//System.out.println(binToDec(n));
		//System.out.print(decToBin(n));
		//System.out.print(octalTodec(n));
		//System.out.print(decToOctal(n));
		//System.out.print(hexTodec(n));
		//System.out.print(decToHex(n));
		//System.out.print(octalToHex(n));
		//System.out.print(hexToOctal(n));
		//System.out.print(hexToBin(n));
		//System.out.print(binToHex(n));
		//System.out.print(octalToBin(n));
		//System.out.print(binToOctal(n));


	}

	/**
	* Passes the binary code, a counter, and a value holder to helperMethod and passes the returned value and a value holder to helperMethod4.
	* @param n
	* The bin code inputted by the user.
	* @return
	* The returned value of helperMethod4(x, d).
	**/
	private static long binToOctal(long n) {
		int c = 0; //The counter is given the value of 0. This will be the exponent that 2 will be raised to.
		int d = 0; //The value holder is given the value of 0.
		int x = helperMethod(n, c, d); //The returned value of helperMethod(n, c, d) will be returned which is binary to decimal.
		return Long.parseLong(helperMethod4(x, d)); //Returns the returned value of helperMethod4(x, d) parsed to long which is deicmal to octal.
		
	}

	/**
	* Passes the octal code, a counter, and a value holder to helperMethod3 and passes the returned value and a value holder to helperMethod2.
	* @param n
	* The octal code inputted by the user.
	* @return
	* The returned value of helperMethod2(y, d).
	**/
	private static long octalToBin(int n) {
		int c = 0; //The counter is given the value of 0. This will be the exponent that 8 will be raised to.
		int d = 0; //The value holder is given the value of 0.
		int x = helperMethod3(n, c, d); //The returned value of helperMethod3(n, c, d) will be returned which is octal to decimal.
		return Long.parseLong(helperMethod2(x,d)); //Returns the returned value of helperMethod2(x, d) parsed to long which is decimal to binary.
	}

	/**
	* Passes the binary code, a counter, and a value holder to helperMethod and passes the returned value and a value holder to helperMethod6.
	* @param n
	* The binary code inputted by the user.
	* @return
	* The returned value of helperMethod6(x, d).
	**/
	private static String binToHex(long n) {
		int c = 0; //The counter is given the value of 0. This will be the exponent that 2 will be raised to.
		int d = 0; //The value holder is given the value of 0.
		int x = helperMethod(n, c, d); //The variable x is given the returned value of helperMethod(n, c, d) which is bin to decimal.
		return helperMethod6(x, d); //Returns the returned value of helperMethod6(x, d) which is decimal to hex.
	}

	/**
	* Passes the hex code, a counter, a value holder, and the length of the hex code - 1 to helperMethod5 and passes the returned value and a value holder to helperMethod2.
	* @param n
	* The hex code inputted by the user.
	* @return
	* The returned value of helperMethod2(y, d).
	**/
	private static long hexToBin(String n) {
		int c = 0; //The counter is given the value of 0. This will be the exponent that 2 will be raised to.
		int d = 0; //The value holder is given the value of 0.
		int i = n.length()-1; //The variable i is given the value of the length of the hex code - 1.
		int y = helperMethod5(n, c, d, i); //The variable y is given the returned value of helperMethod5(n, c, d, i) which is hex to decimal.
		return Long.parseLong(helperMethod2(y,d)); //The return of helperMethod2(y, d) parsed to long is returned which is decimal to bin
	}

	/**
	* Passes the hex code, a counter, a value holder, and the length of the hex code - 1 to helperMethod5 and passes the returned value and a value holder to helperMethod4.
	* @param n
	* The hex code inputted by the user.
	* @return
	* The returned value of helperMethod4(y, d).
	**/
	private static long hexToOctal(String n) {
		int c = 0; //The counter is given the value of 0. This will be the exponent that 16 will be raised to.
		int d = 0; //The value holder is given the value of 0.
		int i = n.length() - 1; //The variable i is given the value of the length of the hex code - 1.
		int y = helperMethod5(n, c, d, i); //The variable y is given the returned value of helperMethod5(n, c, d, i) which is hex to decimal.
		return Long.parseLong(helperMethod4(y, d)); //The return of helperMethod4(y, d) parsed to long is returned which is decimal to octal.
	}

	/**
	* Passes the octal code, a counter, and value holder to helperMethod3 and passes the returned value and a value holder to helperMethod6.
	* @param n
	* The octal code inputted by the user.
	* @return
	* The returned value of helperMethod6(x, d).
	**/
	private static String octalToHex(int n) {
		int c = 0; //The counter is given the value of 0. This will be the exponent that 8 will be raised to.
		int d = 0; //The value holder is given the value of 0.
		int x = (helperMethod3(n, c, d)); //The variable x is given the value of the return of heloerMethod3(n, c, d) which is octal to decimal.
		return helperMethod6(x, d); //The returned value of helperMethod6(x, d) is returned which is decimal to hex.
	}

	/**
	* Passes the decimal and value holder to helperMethod6 and returns it.
	* @param n
	* The decimal inputted by the user.
	* @return
	* The returned value of helperMethod6(n, d).
	**/
	private static String decToHex(int n) {
		int d = 0; //The value holder is given the value of 0.
		return helperMethod6(n, d); //The returned value of helperMethod6(n, d) is returned.
	}

	/**
	* Returns the decimal converted into hex code.
	* @param n
	* The decimal.
	* @param d
	* The value holder.
	* @param i
	* @return
	* The decimal converted into hex code.
	**/
	private static String helperMethod6(int str, int d) {
		d = 0; //The value holder variable is reset.
		String o = ""; //The String value holder variable is reset.
		if (str == 0) //If str is equal to 0, "" is returned.
			return "";
		d = str%16; //d is given the value of the remainder of str divided by 16.
		if (d == 10) //If d is equal to 10, o is given the String value of "A".
			o = "A";
		else if (d == 11) //If d is equal to 11, o is given the String value of "B".
			o = "B";
		else if (d == 12) //If d is equal to 12, o is given the String value of "C".
			o = "C";
		else if (d == 13) //If d is equal to 13, o is given the String value of "D".
			o = "D";
		else if (d == 14) //If d is equal to 14, o is given the String value of "E".
			o = "E";
		else if (d == 15) //If d is equal to 15, o is given the String value of "F".
			o = "F";
		else
			o = d + ""; //o is given the value of d converted into a String.
		return helperMethod6(str/16, d) + o; //The String value being held is attached to the returned value of helperMethod6(str/16, d).
	}

	/**
	* Passes the hex code, a counter, and value holder, and the length of the octal code - 1 to helperMethod4 and returns it.
	* @param n
	* The hex coded inputted by the user.
	* @return
	* The returned value of helperMethod5(n, c, d, i).
	**/
	private static int hexTodec(String n) {
		int c = 0; //The counter is given the value of 0. This will be the exponent that 16 will be raised to.
		int d = 0; //The value holder is given the value of 0.
		int i = n.length()-1; //The variable i is given the value of the length of the hex code - 1.
		return helperMethod5(n, c, d, i); //The returned value of helperMethod5(n, c, d, i) will be returned.
	}

	/**
	* Returns the hex code converted into decimal.
	* @param n
	* The hex code.
	* @param c
	* The counter.
	* @param d
	* The value holder.
	* @param i
	* The location of the character being checked.
	* @return
	* The hex code converted into decimal.
	**/
	private static int helperMethod5(String n, int c, int d, int i) {
		d = 0; //The value holder variable is reset.
		if (c == n.length()) //If the counter is equal to the length of the hex code, 0 is returned.
			return 0;
		if (Character.isDigit(n.charAt(i))) { //If the character at i is a digit, d is given the numeric value of the char times 16 to the power of the counter variable c.
			d = (int) ((int) (Character.getNumericValue(n.charAt(i)))*Math.pow(16, c)); //Numeric value or else Unicode will be used.
		}
		else if(n.charAt(i) == 'A') { //If the character at i is the letter A, d is given the value of 10 times 16 to the power of the counter variable c.
			d = (int) (10*Math.pow(16, c));
		}
		else if(n.charAt(i) == 'B') { //If the character at i is the letter B, d is given the value of 11 times 16 to the power of the counter variable c.
			d = (int) (11*Math.pow(16, c));
		}
		else if(n.charAt(i) == 'C') { //If the character at i is the letter C, d is given the value of 12 times 16 to the power of the counter variable c.
			d = (int) (12*Math.pow(16, c));
		}
		else if(n.charAt(i) == 'D') { //If the character at i is the letter D, d is given the value of 13 times 16 to the power of the counter variable c.
			d = (int) (13*Math.pow(16, c));
		}
		else if(n.charAt(i) == 'E') { //If the character at i is the letter E, d is given the value of 14 times 16 to the power of the counter variable c.
			d = (int) (14*Math.pow(16, c));
		}
		else if(n.charAt(i) == 'F') { //If the character at i is the letter F, d is given the value of 15 times 16 to the power of the counter variable c.
			d = (int) (15*Math.pow(16, c));
		}
		return d + helperMethod5(n, c + 1, d, i - 1); //The value being held is added to the returned value of helperMethod5(n, c + 1, d, i - 1).
	}

	/**
	* Passes the decimal and value holder to helperMethod4 and returns it.
	* @param n
	* The decimal inputted by the user.
	* @return
	* The returned value of helperMethod4(n, d).
	**/
	private static long decToOctal(int n) {
		int d = 0; //The value holder is given the value of 0.
		return Long.parseLong(helperMethod4(n, d)); //Returns the returned value of helperMethod4(n, d) parsed to long.
	}

	/**
	* Returns the decimal converted into octal code.
	* @param n
	* The decimal.
	* @param d
	* The value holder.
	* @return
	* The decimal converted into octal code.
	**/
	private static String helperMethod4(int n, int d) {
		d = 0; //The value holder variable is reset.
		String o = ""; //The String value holder variable is reset.
		if (n == 0) //If n is equal to 0, 0 is returned as a String.
			return "0";
		d = n%8; //d is given the value of the remainder of n divided by 8.
		o = d + ""; //o is given the value of d converted into a String.
		return helperMethod4(n/8, d) + o; //The returned value of helperMethod4(n/8, d) will be returned.
	}

	/**
	* Passes the octal code, a counter, and value holder to helperMethod3 and returns it.
	* @param n
	* The octal code inputted by the user.
	* @return
	* The returned value of helperMethod3(n, c, d).
	**/
	private static int octalTodec(int n) {
		int c = 0; //The counter is given the value of 0. This will be the exponent that 8 will be raised to.
		int d = 0; //The value holder is given the value of 0.
		return helperMethod3(n, c, d); //The returned value of helperMethod3(n, c, d) will be returned.
	}

	/**
	* Returns the octal code converted into decimal.
	* @param n
	* The octal code.
	* @param c
	* The counter.
	* @param d
	* The value holder.
	* @return
	* The octal code converted into decimal.
	**/
	private static int helperMethod3(int n, int c, int d) {
		d = 0; //The value holder variable is reset.
		if (n == 0) //If n is equal to 0, 0 is returned as an integer.
			return (int) n;
		if (n%10 != 0) { //If the remainder of n divided by 10 is not equal to 0, d is equal to the remainder times 8 to the power of the counter variable c.
			d = (int) ((int) (n%10)*Math.pow(8, c));
		}
		n = n/10; //n is equal to n divided by 10 to remove the last digit of the octal.
		return d + helperMethod3(n, c + 1, d); //The value being held is added to the returned value of helperMethod3(n, c + 1, d).
	}

	/**
	* Passes the decimal and value holder to helperMethod2 and returns it.
	* @param n
	* The decimal inputted by the user.
	* @return
	* The returned value of helperMethod2(n, d).
	**/
	private static long decToBin(int n) {
		int d = 0; //The value holder is given the value of 0.
		return Long.parseLong(helperMethod2(n,d)); //Returns the returned value of helperMethod2(n, d) parsed to long.
	}

	/**
	* Returns the decimal converted into binary code.
	* @param n
	* The decimal.
	* @param d
	* The value holder.
	* @return
	* The decimal converted into binary code.
	**/
	private static String helperMethod2(int n, int d) {
		d = 0; //The value holder variable is reset.
		String o = ""; //The String value holder variable is reset.
		if (n == 0) //If n is equal to 0, 0 is returned as a String.
			return "0";
		d = n % 2; //d is equal to the remainder of n divided by 2.
		o = d+ ""; //o is given the value of d converted into a String.
		return helperMethod2(n/2,d) + o; //The returned value of helperMethod2(n/2, d) will be returned.
	}

	/**
	* Passes the binary code, a counter, and value holder to helperMethod and returns it.
	* @param n
	* The binary code inputted by the user.
	* @return
	* The returned value of helperMethod(n, c, d).
	**/
	private static int binToDec(long n) {
		int c = 0; //The counter is given the value of 0. This will be the exponent that 2 will be raised to.
		int d = 0; //The value holder is given the value of 0.
		return helperMethod(n, c, d); //The returned value of helperMethod(n, c, d) will be returned.
	}

	/**
	* Returns the binary code converted into decimal.
	* @param n
	* The binary code.
	* @param c
	* The counter.
	* @param d
	* The value holder.
	* @return
	* The binary code converted into decimal.
	**/
	private static int helperMethod(long n, int c, int d) {
		d = 0; //The value holder variable is reset.
		if (n == 0) //If n is equal to 0, n is returned as an integer.
			return (int) n;
		if (n%10 == 1) { //If the remainder of n divided by 10 is 1, the value holder is given the value of 2 to the power of the counter variable c.
			d = (int) Math.pow(2, c);
		}
		n = n/10; //n is divided by 10 to remove the last digit of the binary.
		return d + helperMethod(n, c + 1, d); //The value being held is added to the returned value of helperMethod(n, c + 1, d).
	}

	/**
	* Returns the result of a raised to the power of b.
	* @param a
	* The base.
	* @param b
	* The exponent.
	* @return
	* a raised to the power of b.
	**/
	private static int exponent(int a, int b) {
		if (b == 1) //If b is equal to 1, a is returned.
			return a;
		else if (b == 0) //If b is equal to 0, 1 is returned.
			return 1;
		return a*exponent(a, b - 1); //a times the returned value of exponent(a, b - 1) is returned. 
	}
	
	/**
	* Returns the sum of all numbers between 0 and n.
	* @param n
	* The input from the user.
	* @return
	* Sum of all numbers between 0 and n.
	**/
	private static int sum(int n) {
		if (n <= 1) //If n is less than or equal to 1, 1 is returned.
			return 1;
		return n+sum(n - 1); //n plus the returned value of sum(n - 1) is returned.
	}

	/**
	* Calculates and returns the factorial for integer n, inputted by the user.
	* @param n
	* The input from the user.
	* @return
	* The factorial of n.
	**/
	private static int factorial(int n) {
		if (n <= 1) //If n is less than or equal to 1, 1 is returned.
			return 1;
		return n*factorial(n - 1); //n times the factorial of n - 1 is returned. 
	}

}
