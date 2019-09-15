import java.util.ArrayList;
import java.util.Scanner;

public class CustomerLister {
	public static void main (String[] args) {
		int index = 0;
		double balance;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> customerName = new ArrayList<String>();
		
		customerName.add("Cathy");
		customerName.add("Ben");
		customerName.add("Jorge");
		customerName.add("Wanda");
		customerName.add("Freddie");
		
		ArrayList<Double> customerBalance = new ArrayList<Double>();
		
		customerBalance.add(87.92);
		customerBalance.add(1.02);
		customerBalance.add(25.32);
		customerBalance.add(2000000.42);
		customerBalance.add(55001.12);
		
		while (index < customerName.size()) {
			System.out.println(customerName.get(index) + "\t $" + customerBalance.get(index));
			index++;
		}
	}
}
	
