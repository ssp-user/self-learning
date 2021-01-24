package puzzles_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EvenOdd {

	public static void main(String[] args) {
		Integer inputArray[] = {12, 34, 45, 9, 8, 90, 3};
		List<Integer> inputArrayList = Arrays.asList(inputArray);
//		Set<Integer> oddSet = new HashSet<Integer>();
		Set<Integer> oddSet = new LinkedHashSet<Integer>();		
//		Set<Integer> evenSet = new HashSet<Integer>();
		Set<Integer> evenSet = new LinkedHashSet<Integer>();		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i]%2 == 0) {
				evenSet.add(inputArray[i]);
				//System.out.println(inputArray[i]+ " number is even");
			}
			else {
				oddSet.add(inputArray[i]);
				//System.out.println(inputArray[i]+ " number is odd");				
			}
		}
		ArrayList<Integer> outputArrayList = new ArrayList<Integer>(evenSet);
		outputArrayList.addAll(oddSet);
		System.out.println("input array is "+ inputArrayList);		
		System.out.println("output array is "+ outputArrayList);
		outputArrayList.stream().forEach(ele-> System.out.println(ele));
		for (Integer integer : outputArrayList) {
			System.out.println(integer);
		}
	}

}
