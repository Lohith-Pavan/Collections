package CollectionsConcept;
import java.util.*;
public class CollectionInClass {
    List<Integer> number = new ArrayList<Integer>();
    CollectionInClass(){
    	number.add(4);
    	number.add(2);
    	number.add(7);
    	number.add(3);
    }
    void display() {
    	for(int n : number) {
    		System.out.println(n);
    	}
    }
    public static void main(String args[]) {
    	CollectionInClass obj = new CollectionInClass();
    	obj.display();
    }
}
