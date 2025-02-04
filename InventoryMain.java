package CollectionsConcept;

public class InventoryMain {
    public static void main(String args[]) {
    	Inventory ob = new Inventory();
    	Product p1 = new Product("Sneakers",50);
    	Product p2 = new Product("Formals",10);
    	Product p3 = new Product("Casual",30);
    	ob.addProduct(p1);
    	ob.addProduct(p2);
    	ob.addProduct(p3);
    	ob.display();
    	System.out.println("Check Inventory: ");
    	ob.CheckLowInventory();
    }
}
