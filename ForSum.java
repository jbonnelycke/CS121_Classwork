import java.util.Scanner;
public class ForSum {
	public static void main (String[] args) {
		int loopAmt, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the number you would like to use?");
		loopAmt = scan.nextInt();
		for (int count = 1; count <= loopAmt; count++) {
			sum = sum + count;
		}
		System.out.println(sum);
	}
}
