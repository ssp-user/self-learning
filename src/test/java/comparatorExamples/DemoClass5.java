package comparatorExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoClass5 {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(305);
		values.add(998);
		values.add(774);
		values.add(236);
		values.add(881);		
	
		Collections.sort(values, (o1,o2) -> {
				if (o1%100 > o2%100) 
					return 1;
				return -1;
		});
		
		for (Integer integer : values) {
			System.out.println(integer);
		}			
	}
}
