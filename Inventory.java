package CollectionsConcept;
import java.util.*;
public class Inventory {
	 Scanner sc = new Scanner(System.in);
     ArrayList<Product> productsList;
     Inventory(){
    	 productsList = new ArrayList<Product>();
     }
     void display() {
    	 for(Product n : productsList) {
    		 System.out.println(n);
    	 }
     }
     void addProduct(Product product) {
    	 productsList.add(product);
     }
     void RemoveProduct() {
    	 System.out.println("Remove product: ");
    	 String product = sc.next();
    	 for (Product n : productsList) {
    		 if(n.product.equals(product)) {
    			 productsList.remove(n);
    			 break;
    		 }		 
    	 }
    	 display();
     }
     void CheckLowInventory() {
    	 int min = productsList.get(0).quantity;
    	 for(Product n : productsList) {
    		 if(n.quantity < min) {
    			 min = n.quantity;
    		 }
    	 }
    	 for(Product n : productsList) {
    		 if(n.quantity == min) {
    			 System.out.print("Low Inventory : ");
    			 System.out.println(n);
    		 }
    	 }
     }
}
