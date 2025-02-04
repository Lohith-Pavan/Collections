package CollectionsConcept;
import java.util.ArrayList;
import java.util.List;

public class ForEachex {
	public static void main(String args[]) {
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(3);
		numbersList.add(5);
		numbersList.add(7);
		numbersList.add(4);
		numbersList.add(10);
//		for(int number : numbersList) {
//			System.out.println(number);
//		}
		numbersList.forEach(number -> System.out.println(number));
	}
}
