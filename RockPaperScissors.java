import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	final static int OPTIONS = 3;
	final static int ROCK = 1, PAPER = 2, SCISSORS = 3;
	final static int COMPUTER = 1, PLAYER = 2, TIE = 3;

	// -----------------------------------------------------------------
	// Plays the Rock-Paper-Scissors game with the user.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		int computerChoice, playerChoice, winner = 0;
		int wins = 0, losses = 0, ties = 0;
		String again;

		Scanner scan = new Scanner(System.in);
		again = "y";

		while (again.equals("y")) {
			// Get player choice
			System.out.println("Enter your choice - 1 for Rock, 2 for Paper, and 3 for Scissors: ");
			playerChoice = scan.nextInt();

			// Get CPU choice
			Random randGen = new Random();
			computerChoice = randGen.nextInt(3) + 1;

			// Reveal CPU Choice
			if (computerChoice == 1)
				System.out.println("My choice was Rock.");
			else if (computerChoice == 2)
				System.out.println("My choice was Paper.");
			else
				System.out.println("My choice was Scissors.");

			// Choose Winner
			switch (chooseWinner(computerChoice, playerChoice)) {
			case 1:
				System.out.println("I Win!");
				losses++;
				break;
			case 2:
				System.out.println("You win!");
				wins++;
				break;
			case 3:
				System.out.println("We tied!");
				ties++;
				break;
			}
			System.out.println("");
			System.out.println("Play again (y/n)?");
			again = scan.next();
			System.out.println("");
		}

		// Print final results
		System.out.println();
		System.out.println("You won " + wins + " times.");
		System.out.println("You lost " + losses + " times.");
		System.out.println("We tied " + ties + " times.");
	}

	public static int chooseWinner(int computerChoice, int playerChoice) {
		// Player wins
		if ((playerChoice == 2 && computerChoice == 1) || (playerChoice == 1 && computerChoice == 3)
				|| (playerChoice == 3 && computerChoice == 2))
			return 2;
		// Computer wins
		else if ((computerChoice == 2 && playerChoice == 1) || (computerChoice == 1 && playerChoice == 3)
				|| (computerChoice == 3 && playerChoice == 2))
			return 1;
		// Tie
		else
			return 3;
	}
}