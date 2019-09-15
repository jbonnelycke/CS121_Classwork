/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
//lab18
public class BankAccount implements Comparable<BankAccount> {
	private double balance;

	// constructor
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	public void deposit(double amount) {
		double newBalance = balance + amount;
		balance = newBalance;
	}

	public void withdraw(double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
	}

	public double getBalance() {
		return balance;
	}

	/**
	 * Compares two bank accounts. return 1 if this bank account has a greater
	 * balances than the other one, -1 if this bank account is has a smaller balance
	 * than the other one, and 0 if both bank accounts have the same balance
	 */
	public int compareTo(BankAccount other) {
		if (balance < other.balance)
			return -1;
		else if (balance > other.balance)
			return 1;
		else
			return 0;
	}

}
