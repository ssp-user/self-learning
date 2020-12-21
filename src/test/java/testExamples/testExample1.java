package testExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testExample1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(987);
		list.add(321);
		list.add(234);
		list.add(123);
		list.add(876);
		list.add(169);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("List after sorting");
		for (Integer integer : list) {
			System.out.println(integer);
		}		
	}

}
