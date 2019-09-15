import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		int userInput;
		int average = 0;
		Scanner scan = new Scanner(System.in);
		do {
			userInput = scan.nextInt();
			if (userInput != 999) {
				sum += userInput;
				count++;
			}
		} while (userInput != 999);
		average = sum / count;
		System.out.println("avg score: " + average);
	}
}
