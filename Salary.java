import java.text.NumberFormat;
import java.util.Scanner;
public class Salary
{
	public static void main (String[] args)
	{
		double currentSalary; // employee's current salary
		double raise; // amount of the raise
		double newSalary; // new salary for the employee
		
		int rating; // performance rating
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print("Enter the performance rating (3 is Excellent, 2 is Good, or 1 is Poor): ");
		rating = scan.nextInt(); 
		
		switch (rating) {
		case 3:
			raise = currentSalary * 0.06;
			break;
		case 2:
			raise = currentSalary * 0.04;
			break;
		case 1:
			raise = currentSalary * 0.015;
			break;
		default:
			System.out.println("Invalid input.");
			raise = 0;			
		}
		
		newSalary = currentSalary + raise;
		
		// Print the results
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println( "Your new salary: " + money. format (newSalary) );
		System.out.println();
	}
}
