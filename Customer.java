package CollectionsConcept;
import java.util.*;;
public class Customer extends Owner{
	   
	     public static void main(String args[]) {
    	    Owner ob = new Owner();
    	    System.out.println("--------Menu---------");
    	    Order a = new Order("Vuda",2);
    	    Order b = new Order("Puri",3);
    	    ob.menu();
       	    ob.order(a);
    	    ob.order(b);
    	    ob.bill();
     }
}
