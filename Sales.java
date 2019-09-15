
// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		final int SALESPEOPLE = 5;
		int[] sales = new int[SALESPEOPLE];
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		// fill in the condition of the for loop
		for (int i = 0; i < sales.length; i++) {
			System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
			sales[i] = scan.nextInt();
		}
		
		System.out.println("\nSalesperson Sales");
		System.out.println("-----------------");
		sum = 0;

		// fill in the condition of the for loop
		for (int i = 0; i < sales.length; i++) {
			System.out.println(" " + (i + 1) + " " + sales[i]);
			sum += sales[i];
		}
		
		System.out.println("\nTotal sales: " + sum);
		System.out.println("Average sales: " + ((double) sum / (sales.length)));
	}
}
