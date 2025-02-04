package CollectionsConcept;

public class Product {
     String product;
     int quantity;
	public Product(String product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "product=" + product + ", quantity=" + quantity;
	}
    
}
