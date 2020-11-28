package puzzles_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pair_Sum_C {

	public static void main(String[] args) {
		Integer arr[] = {8,7,2,5,3,1};
		int sum = 9;
		findPair(arr, sum);
	} 
	public static void findPair(Integer array[],int desiredSum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array " + i + " element is "+ array[i]);
			if (map.containsKey(desiredSum - array[i])) {
				System.out.println("Pair found at index " + map.get(desiredSum - array[i]) + " and " + i);
				return;
			}
			map.put(array[i], i);
		}
		System.out.println("Pair not found");
	}
}
