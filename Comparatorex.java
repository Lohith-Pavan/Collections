package CollectionsConcept;
import java.util.*;
public class Comparatorex {
     public static void main(String args[]) {
    	 List<Integer> list = new ArrayList<Integer>();
    	 list.add(574);
    	 list.add(349);
    	 list.add(642);
    	 list.add(845);
    	 list.add(565);
//    	 Collections.sort(list);
//    	 Collections.reverse(list);
    	 Comparator<Integer> com = (o1,o2) -> {return o1%100 > o2%100?1:-1;};
    				
    	 
    	
    	 Collections.sort(list, com);
    	 list.forEach(System.out::println);
     }
}
