package CollectionsConcept;
import java.util.Iterator;
import java.util.Collection;
import java.util.TreeSet;
public class example2 {
      public static void main(String args[]) {
    	  Collection<Integer> nums = new TreeSet<Integer>();
    	  nums.add(62);
    	  nums.add(54);
    	  nums.add(82);
    	  nums.add(21);
//    	  nums.add(6);
//    	  nums.add(2);
    	  Iterator<Integer> values = nums.iterator();
    	  while(values.hasNext()) {
    		  
    		  System.out.println(values.next());
    	  }
//    	  System.out.println(nums.indexOf(8));
//    	  System.out.println(nums.get(2));
//    	  for (int n: nums) {
//    		  System.out.println(n);
//    	  }
    	  
      }
}

