package puzzles_medium;

import java.util.HashMap;
import java.util.Map;

public class Sub_array_A {

	public static void main(String[] args) {
		Integer array[] = {4,2,-3,-1,0,4};
		int desiredSum = 3;

		int length = array.length;
		/*
		 * int i,j = 0; while (true) { incrementalSum = incrementalSum + array[i]; i++;
		 * }
		 */
		
		for (int i = 0; i < array.length; i++) {
			int incrementalSum = array[i];			
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(i, array[i]);			
			for (int j = i + 1; j < array.length; j++) {
				System.out.println("Value of i is "+ i + " Value of j is "+ j);
				map.put(j, array[j]);
				//System.out.println("Pre increment sum is "+ incrementalSum);
				incrementalSum = incrementalSum + array[j];
				System.out.println("Post increment sum is "+ incrementalSum);
				if (incrementalSum == desiredSum) {
					System.out.println("***************Sub Array Found*******");
					for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
						System.out.print(entry.getValue() + "   ");
					}
					System.out.println("");
					System.out.println("***********************");
				}
//				map.put(j, array[j]);				
	//			incrementalSum = incrementalSum + array[j];				
			}
		}
		
	}
}
