package CollectionsConcept;
import java.util.*;
public class Mapex {
   public static void main(String args[]) {
	   Map<String,String> map = new Hashtable<>();
	   map.put("myName","Lohith");
	   map.put("actor","John");
	   map.put("ceo","Lohith Pavan");
	   map.put("myName","Pavan");
	   Set<String> keys = map.keySet();
	   for(String key : keys) {
	   System.out.println(key + " " + map.get(key));
	   
	   
	   }
//	   Set<Map.Entry<String,String>> values = map.entrySet();
//	   for(Map.Entry<String, String> e : values) {
//		   System.out.println(e.getKey() + " " + e.getValue());
//	   }
   }
}
