package testExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class testExample2 {

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
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1%100 > o2%100)
					return 0;
				return -1;
			}
		});
		System.out.println("List after sorting");
		for (Integer integer : list) {
			System.out.println(integer);
		}		
	}

}
