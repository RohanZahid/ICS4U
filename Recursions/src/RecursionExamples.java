import java.util.Scanner;

public class RecursionExamples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//long n = sc.nextLong();
		//System.out.println(factorial(n));
		//System.out.println(sum(n));
		//System.out.println(exponent(a,b));
		//System.out.println(binToDec(n));
		System.out.print(decToBin(n));


	}

	private static long decToBin(int n) {
		int d = 0;
		String str = n + "";
		return helperMethod2(str,d);
	}

	private static String helperMethod2(String str, int d) {
		d=0;
		if (str.equals("0")) 
			return str;
		if ((str%2==1) {
			d = 1;
		}
		else {
			d = 0;
		}
		str=str/2;
		return helperMethod2(str,d)+d;
	}

	private static int binToDec(long n) {
		int c = 0;
		int d = 0;
		return helperMethod(n, c, d);
	}

	private static int helperMethod(long n, int c, int d) {
		d=0;
		if (n==0) 
			return (int) n;
		if (n%10==1) {
			d = (int) Math.pow(2, c);
		}
		n=n/10;
		return d+helperMethod(n,c+1,d);
	}

	private static int exponent(int a, int b) {
		if (b==1)
			return a;
		else if (b==0)
			return 1;
		return a*exponent(a,b-1);

	}

	private static int sum(int n) {
		if (n<=1)
			return 1;
		return n+sum(n-1);
	}

	private static int factorial(int n) {
		if (n<=1)
			return 1;
		return n*factorial(n-1);
	}

}
