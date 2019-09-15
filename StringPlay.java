// **************************************************
// StringPlay.java
//
// Play with String objects
// **************************************************
import java.util.Scanner;

public class StringPlay
{
	public static void main (String[] args)
	{
		String college = new String ("Princeton University");

		String town = new String ("Princeton, NJ, USA");

		int stringLength;
		String change1, change2, change3, change4, change5;

		stringLength = college.length();

		System.out.println (college + " contains " + stringLength + " characters.");

		change1 = college.substring(0, 3);
		
		change2 = college.substring(10);

		change3 = college.toUpperCase();

		change4 = change3.replace('O', '*');

		change5 = (college + town);

		System.out.println("Mutation #1 :" + change1);
		System.out.println("Mutation #2 :" + change2);
		System.out.println("Mutation #3 :" + change3);
		System.out.println("Mutation #4 :" + change4);
		System.out.println("Mutation #5 :" + change5);
		
		System.out.println("Enter your college name: ");
		
		Scanner scan = new Scanner(System.in);
		college = scan.nextLine(); 
		
		System.out.println("Now enter your college town: ");
		town = scan.nextLine();
		
		System.out.println("Roger Dodger! I'm sure you're doign fantastic at " + college + " in " + town + ".");
	}
}
