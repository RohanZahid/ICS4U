package zahid;
import java.util.Scanner;
/**
 * TowersofHanoi.java
 * Tells user the correct moves to make in order to achieve minimum number of moves.
 * Feb 26, 2018
 * @author RohanZahid
 */
public class TowersofHanoi {
	/**
	 * The main method assigns 'A', 'B', and 'C' to char variables src, aux, and dst, respectively, prompts the user for the number of disks, passes the input to solve(int n, char src, char aux, char dst) and outputs what is returned.
	 * @param args
	 * unused
	 */
	public static void main(String[] args) {
		char src = 'A', aux = 'B', dst = 'C'; //src means the source. aux means auxiliary (middle), dst means destination.
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Tower of Hanoi. Enter number of disks.");
		int n = sc.nextInt(); //Saves the input to a variable called n.
		solve(n, src, aux, dst); //Passes n, src, aux, and dst to the method solve.

	}
	/**
	 * Rearranges the locations of the disks and ouputs the move that the user should make.
	 * @param n
	 * The number of disks
	 * @param src
	 * The starting position.
	 * @param aux
	 * The position that is not the starting or destination (auxiliary).
	 * @param dst
	 * The end position.
	 * @return
	 * void.
	 **/
	private static void solve(int n, char src, char aux, char dst) {
		if (n == 0) { //If the number of disks is 0, exit.
			return;
		}
		else {
			solve (n-1, src, dst, aux); //Passes n-1, src, dst, aux to solve(int n, char src, char aux, char dst).
			System.out.println("Move from " + src + " to " + dst + "."); //Outputs "Move from " the value stored in src " to " the value stored in dst.
			solve (n-1, aux, src, dst); //Passes n-1, aux, src, dst to solve(int n, char src, char aux, char dst).
		}

	}

}
