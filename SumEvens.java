import java.util.Scanner;

public class SumEvens {
	// -----------------------------------------------------------------
	// Computes and prints the sum of the even values between 2 and
	// a positive value entered by the user.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		int userInput;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number that fits the condition, 2 <= x <= 100");
		userInput = scan.nextInt();
		
		if (userInput > 100)
			System.out.println("The value must be less than 100.");
		else if (userInput < 2)
			System.out.println("The value must be greater than two.");
		else {
			int sum = 0;
			for (int i = 2; i <= userInput; i += 2) {
				sum += i;
			}
			System.out.println("The sum of the even integers from 2 to " + userInput + " is " + sum);
		}
	}
}
