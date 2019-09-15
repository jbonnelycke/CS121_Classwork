import java.util.Scanner;

public class CountIntegers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput = 1, count = 0;
		int[] numArray = new int[51];
		int[] timesArray = new int[51];
		
		// Populate the "Numbers" array 
		for (int i = 0; i < 51; i++) {
			numArray[i] = i;
		}
		
		// Avoids adding an additional 1 from the instantiation
		userInput = scan.nextInt();
		
		// Gather contents of the array
		do {
			timesArray[userInput]++;
			userInput = scan.nextInt();
		} while ((userInput >= 0) && (userInput <= 50));
		
		// Print out the contents of the array
		System.out.println("Number\tTimes");
		for (int i = 0; i < 51; i++) {
			if (timesArray[i] != 0) {
				System.out.println(numArray[i] + "\t" + timesArray[i]);
			}
		}
	}
}
