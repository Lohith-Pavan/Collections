package CollectionsConcept;

import java.util.Comparator;

public class ComImp implements Comparator<Integer>{
		@Override
		public int compare(Integer o1,Integer o2) {
//			if(o1<o2) { // for entire value
//			if(o1%10 > o2%10) { //sorted order for last digits
			if(o1%100 > o2%100) { //sorted order for last 2 digits
				return 1;
			}
			return -1;
		}
}
