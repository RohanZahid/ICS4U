import java.util.Scanner;

public class TowersofHanoi {
/**
 * TowersofHanoi
 * 2018-02-26
 * @param Tells user the correct moves to make in order to achieve minimum number of moves.
 * @author RohanZahid
 */
	public static void main(String[] args) {
		char src = 'A', aux = 'B', dst = 'C';
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Tower of Hanoi. Enter number of disks.");
		int n = sc.nextInt();
		solve(n, src, aux, dst);

	}

	private static void solve(int n, char src, char aux, char dst) {
		if (n == 0) {
			return;
		}
		else {
			solve (n-1, src, dst, aux);
			System.out.println("Move from " + src + " to " + dst + ".");
			solve (n-1, aux, src, dst);
		}
		
	}

}
