package CollectionsConcept;
import java.util.*;
public class Owner {
     List<Menu> list;
     List<Order> orders;
     Menu i1 = new Menu("Idli",30.00);
     Menu i2 = new Menu("Puri",50.00);
     Menu i3 = new Menu("Bonda",30.00);
     Menu i4 = new Menu("Vuda",30.00);
     Menu i5 = new Menu("Dosa",25.00);
     Owner(){
    	 list = new ArrayList<>();
    	 orders = new ArrayList<>();
     }
     void menu() {
    	 list.add(i1);
    	 list.add(i2);
    	 list.add(i3);
    	 list.add(i4);
    	 list.add(i5);
    	 for(Menu n : list) {
    		 System.out.println(n);
    	 }
     }
     void order(Order a) {
		 orders.add(a);
	 }
     void bill() {
    	 System.out.println("-----Ordered Items-----");
    	 for(Order n : orders) {
    		 System.out.println(n);
    	 }
    	 double bill = 0;
    	 for(int i=0;i<list.size();i++) {
    		 for(int j=0;j<orders.size();j++) {
    		    if(list.get(i).foodName.equals(orders.get(j).itemName)) {
    			 bill+=(list.get(i).price * orders.get(j).quantity);
    		     }
    		 }
    	 }
    	 System.out.println("The bill for above items is : "+bill+" rupees");
     }
}
