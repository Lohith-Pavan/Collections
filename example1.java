package CollectionsConcept;

import java.util.List;
import java.util.ArrayList;

public class example1 {
	public static void main(String args[]) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		System.out.println(nums.indexOf(8));
		System.out.println(nums.get(2));

	}
}
