//lab18
import java.util.Scanner;
public class BankAccountTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What should the first account's balance be?");
		double acct1Value = scan.nextDouble();
		System.out.println("What should the second account's balance be?");
		double acct2Value = scan.nextDouble();
		BankAccount acct1 = new BankAccount(acct1Value);
		BankAccount acct2 = new BankAccount(acct2Value);
		switch (acct1.compareTo(acct2)) {
		case -1:
			System.out.println("The second account is greater.");
			break;
		case 0:
			System.out.println("The two accounts are equal.");
			break;
		case 1:
			System.out.println("The first account is greater.");
			break;
		default:
			System.out.println("Error.");
		}
		
	}
}
