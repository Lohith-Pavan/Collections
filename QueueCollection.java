package CollectionsConcept;
import java.util.*;
public class QueueCollection {
      public static void main(String args[]) {
    	  Vector<Integer> n1 = new Vector<Integer>();
    	  n1.add(4);
    	  n1.add(44);
    	  n1.add(55);
    	  n1.add(12);
    	  n1.add(98);
    	  n1.forEach(System.out::println);
    	  n1.insertElementAt(55, 3);
    	  n1.forEach(System.out::println);
    	  
      }
}
