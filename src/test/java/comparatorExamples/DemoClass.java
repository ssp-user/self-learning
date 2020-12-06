package comparatorExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoClass {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(305);
		values.add(998);
		values.add(774);
		values.add(236);
		values.add(881);		
		Comparator<Integer> com = new ComImpl();		
		Collections.sort(values,com);		
		for (Integer integer : values) {
			System.out.println(integer);
		}			
	}
}
