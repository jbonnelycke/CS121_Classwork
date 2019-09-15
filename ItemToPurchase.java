
public class ItemToPurchase {
	private int itemPrice, itemQuantity;
	private String itemName, itemDescription;
	
	public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}
	
	public ItemToPurchase() {
		itemPrice = 0;
		itemQuantity = 0;
		itemName = "none";
		itemDescription = "none";
	}
	
	public void setName(String newName) {
		itemName = newName;
	}
	
	public String getName() {
		return itemName;
	}
	
	public void setQuantity(int newQuantity) {
		itemQuantity = newQuantity;
	}
	
	public int getQuantity() {
		return itemQuantity;
	}
	
	public void setPrice(int newPrice) {
		itemPrice = newPrice;
	}
	
	public int getPrice() {
		return itemPrice;
	}
	
	public void setDescription(String newDescription) {
		itemDescription = newDescription;
	}
	
	public String getDescription() {
		return itemDescription;
	}
	
	public String printItemCost() {
		return itemName + " " + itemQuantity + " "
				+ "@ $" + itemPrice + " = $" + (itemQuantity * itemPrice);
	}
	
	public String printItemDescription() {
		return itemName + ": " + itemDescription;
	}
	
	public String toString() {
		return itemName + " " + itemPrice + " " + itemQuantity + " " + itemDescription;
	}
}
