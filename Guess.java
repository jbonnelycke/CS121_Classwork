
// ************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// ************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess {
	public static void main(String[] args) {
		int numToGuess; //Number the user tries to guess
		int guess; //The user's guess
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		numToGuess = generator.nextInt(10) + 1;
		
		System.out.println("Guess an integer between 1 and 10.");
		guess = scan.nextInt();
		
		while (guess != numToGuess) { //keep going as long as the guess is wrong
			System.out.println("I could've gotten it first. Try again, peasant.");
			guess = scan.nextInt();
		}
		
		System.out.println("May I be the first to congratulate "
				+ "me for being the first to congratulate you on your recent accomplishment.");
	}
}
