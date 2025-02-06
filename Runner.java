package CollectionsConcept;
import java.util.*;
public class Runner {
      public static void main(String args[]) {
    	  List<Laptop> list = new ArrayList<Laptop>();
    	  list.add(new Laptop("Dell",12,800));
    	  list.add(new Laptop("Apple",8,1600));
    	  list.add(new Laptop("Acer",16,1200));
    	  Comparator<Laptop> com = (Laptop o1,Laptop o2) -> {
    			  	return o1.getRam()<o2.getRam()?-1:o1.getRam()>o2.getRam()?1:0;
    	  };
    	  Collections.sort(list,com);
    	  
    	  for(Laptop n : list) {
    		  System.out.println(n);
    	  }
      }
}
