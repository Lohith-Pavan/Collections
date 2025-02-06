package CollectionsConcept;

public class Order {
     String itemName;
     int quantity;
	public Order(String itemName, int quantity) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "itemName=" + itemName + ", quantity=" + quantity;
	}
	
}
