package CollectionsConcept;
import java.util.*;
public class SortingElementsThroughCollections {
     public static void main(String args[]) {
    	 List<Integer> list = new ArrayList<Integer>();
    	 list.add(5);
    	 list.add(2);
    	 list.add(9);
    	 list.add(4);
    	 list.add(7);
    	 list.add(2,3);//Add in between list
    	 System.out.println(Collections.min(list));//and max
    	 Collections.sort(list);//Sorting
    	 for(int n : list) {
    		 System.out.println(n);
    	 }
     }
}
