package CollectionsConcept;

import java.util.*;
public class Customer1{
     public static void main(String args[]) {
    	 Owner1 ob = new Owner1();
    	 System.out.println("---Menu---");
    	 ob.menu();
    	 Map<String,Integer> orders = new TreeMap<>();
    	 orders.put("Idli", 2);
    	 orders.put("Dosa", 2);
    	 ob.displayOrder(orders);
    	 ob.Bill(orders);

     }
}
