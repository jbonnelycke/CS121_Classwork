import java.util.Scanner;
public class ComputerScienceLoop {
	public static void main(String[] args) {
		int count = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many times would you like to loop the loop?");
		int numRuns = scan.nextInt();
		while (count < (numRuns + 1)) {
			System.out.println(count + " Computer Science is cool!!");
			count++;
		}
		
		System.out.println("");
		System.out.println("This message is printed " + numRuns + " times.");
	}
}
