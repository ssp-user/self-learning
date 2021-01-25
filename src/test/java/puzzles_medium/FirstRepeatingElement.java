package puzzles_medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		Integer [] input = {10, 5, 3, 4, 3, 5, 6};
		List<Integer> arrLst = new ArrayList<Integer>();
		Set<Integer> arrSt = new LinkedHashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			arrLst.add(input[i]);
			arrSt.add(input[i]);
		}
		for (Integer integer : arrSt) {
			System.out.println("Frequency of "+ integer + " in array is "+ Collections.frequency(arrLst, integer));
			if (Collections.frequency(arrLst, integer) == 1) {
				System.out.println("First repeating element is "+ integer);
				break;				
			}
		}
	}

}
