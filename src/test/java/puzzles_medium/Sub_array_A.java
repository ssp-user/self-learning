package puzzles_medium;

import java.util.HashMap;
import java.util.Map;

public class Sub_array_A {

	public static void main(String[] args) {
		Integer array[] = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
		int desiredSum = 0;
		for (int i = 0; i < array.length; i++) {
			int incrementalSum = array[i];			
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(i, array[i]);	
			checkSubArray(incrementalSum, desiredSum, map);			
			for (int j = i + 1; j < array.length; j++) {
				//System.out.println("Value of i is "+ i + " Value of j is "+ j);
				map.put(j, array[j]);
				//System.out.println("Pre increment sum is "+ incrementalSum);
				incrementalSum = incrementalSum + array[j];
				//System.out.println("Post increment sum is "+ incrementalSum);
				checkSubArray(incrementalSum, desiredSum, map);
			}
		}		
	}

	public static void checkSubArray(int incSum, int desSum, Map<Integer, Integer> m) {
		if (incSum == desSum) {
			System.out.println("***************Sub Array Found*******");
			for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
				System.out.print(entry.getValue() + "   ");
			}
			System.out.println("");
			System.out.println("***********************");
		}		
		
	}
	

	
	
	
	
}
