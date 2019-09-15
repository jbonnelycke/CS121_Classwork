import java.util.Scanner;

public class ShoppingCartManager {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		ItemToPurchase tempItem = null;
		System.out.println("Enter Customer's Name:");
		String name = ShoppingCartManager.in.nextLine();
		System.out.println("Enter Today's Date:");
		String date = ShoppingCartManager.in.nextLine();
		
		System.out.println();
		System.out.println("Customer Name: " + name);
		System.out.println("Today's Date: " + date);
		System.out.println();

		ShoppingCart cart = new ShoppingCart(name, date);
		cart.printMenu();
		boolean again = true;

		while (again) {		
			String userInput = ShoppingCartManager.in.nextLine();
			switch (userInput) {
			case "a":
				System.out.println("ADD ITEM TO CART");
				System.out.println("Enter the item name:");
				String itemName = ShoppingCartManager.in.nextLine();
				System.out.println("Enter the item description:");
				String itemDescription = ShoppingCartManager.in.nextLine();
				System.out.println("Enter the item price:");
				int itemPrice = ShoppingCartManager.in.nextInt();
				System.out.println("Enter the item quantity:");
				int itemQuantity = ShoppingCartManager.in.nextInt();
				ShoppingCartManager.in.nextLine();
				tempItem = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity);
				cart.addItem(tempItem);
				System.out.println();
				cart.printMenu();
				break;
			case "d":
				System.out.println("REMOVE ITEM FROM CART");
				System.out.println("Enter name of item to remove:");
				String itemToBeRemoved = ShoppingCartManager.in.nextLine();
				cart.removeItem(itemToBeRemoved);
				System.out.println();
				cart.printMenu();
				break;
			case "c":
				System.out.println("CHANGE ITEM QUANTITY");
				System.out.println("Enter the item name:");
				String itemToBeChanged = ShoppingCartManager.in.nextLine();
				System.out.println("Enter the new quantity:");
				int newQuantity = ShoppingCartManager.in.nextInt();
				cart.modifyItem(itemToBeChanged, newQuantity);
				System.out.println();
				cart.printMenu();
				break;
			case "i":
				System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
				cart.printDescriptions();
				System.out.println();
				cart.printMenu();
				break;
			case "p":
				System.out.println("Test1");
				System.out.println(cart.getNumItemsInCart());
				System.out.println();
				cart.printMenu();
				break;
			case "o":
				System.out.println("OUTPUT SHOPPING CART");
				cart.printTotal();
				System.out.println();
				cart.printMenu();
				break;
			case "q":
				again = false;	
				break;
			default:
				System.out.println("Choose an option:");
				break;
			}
		}
	}
}
