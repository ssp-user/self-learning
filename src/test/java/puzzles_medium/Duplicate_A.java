package puzzles_medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Duplicate_A {

	public static void main(String[] args) {
		Integer array []= {1,2,4,3,4,2,6,7,8,4,1,1,1,1,2,2,4};
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			al.add(i, array[i]);
			hs.add(array[i]);
		}
		for (Integer integer : hs) {
			//System.out.println("Frequency of "+ integer + " in array is "+ Collections.frequency(al, integer));
			if (Collections.frequency(al, integer) > 1) {
				System.out.println("Duplicate element is "+ integer + " and it frequency is "+Collections.frequency(al, integer));
				
			}
		}
	}

}
