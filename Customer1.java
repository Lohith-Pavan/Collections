package CollectionsConcept;

import java.util.*;
public class Customer1{
     public static void main(String args[]) {
    	 Map<String,Integer> orders = new TreeMap<>();
    	 Owner1 ob = new Owner1();
    	 ob.menu();
    	 orders.put("Idli", 2);
    	 orders.put("Dosa", 2);
    	 ob.displayOrder(orders);
    	 ob.Bill(orders);
     }
}
