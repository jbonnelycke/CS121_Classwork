import java.util.Scanner;
public class ReversedString {
	public static void main(String[] args) {
		String userInput, reverse = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a String that you would like reversed:");
		userInput = scan.nextLine();
		
		for(int index = userInput.length() - 1; index >= 0; index--) {
			reverse = reverse + userInput.charAt(index);
		}
		
		System.out.println("That String reversed is: " + reverse);		
	}	
}
