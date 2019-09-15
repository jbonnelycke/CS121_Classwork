import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int zeroCount = 0, oddCount = 0, evenCount = 0;
		int nextDigit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int userInput = scan.nextInt();

		do {
			nextDigit = userInput % 10;
			if (nextDigit == 0)
				zeroCount++;
			else if (nextDigit % 2 == 0)
				evenCount++;
			else
				oddCount++;
			userInput = userInput / 10;
		} while (userInput > 0);

		System.out.println("zero digits: " + zeroCount);
		System.out.println("even digits: " + evenCount);
		System.out.println("odd digits: " + oddCount);
	}
}