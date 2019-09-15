import java.util.Scanner;
public class ShoppingCartPrinter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Item 1\nEnter the item name:");
		String item1Name = scan.nextLine();
		System.out.println("Enter the item price:");
		int item1Price = scan.nextInt();
		System.out.println("Enter the item quantity:");
		int item1Quantity = scan.nextInt();
		System.out.println("Enter the item description");
		scan.nextLine();
		String item1Description = scan.nextLine();
		
		System.out.println();
		System.out.println("Item 2\nEnter the item name:");
		String item2Name = scan.nextLine();
		System.out.println("Enter the item price:");
		int item2Price = scan.nextInt();
		System.out.println("Enter the item quantity:");
		int item2Quantity = scan.nextInt();
		System.out.println("Enter the item description:");
		scan.nextLine();
		String item2Description = scan.nextLine();
			
		//ItemToPurchase item1 = new ItemToPurchase(item1Price, item1Quantity, item1Name, item1Description);
		//ItemToPurchase item2 = new ItemToPurchase(item2Price, item2Quantity, item2Name, item2Description);
		
		//int total = item1Cost + item2Cost;
		
		System.out.println();
		System.out.println("TOTAL COST");
		//System.out.println(item1.printItemCost());
		//System.out.println(item2.printItemCost());
		//System.out.println(item1.printItemDescription());
		//System.out.println("Total: $" + );
		
	}
}
