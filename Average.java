import java.util.Scanner;

public class Average 
{
	public static void main(String[] args)
	{
		int int1, int2, int3;
		double total;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first integer to be averaged: ");
		int1 = scan.nextInt();
		
		System.out.println("Enter second integer to be averaged: ");
		int2 = scan.nextInt();
		
		System.out.println("Enter third integer to be averaged: ");
		int3 = scan.nextInt();
		scan.close();
		
		total = (double) (int1 + int2 + int3) / 3;
		System.out.println("The average of your three integers is: " + total);
	}
}
