package puzzles_medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Largest_Sub_Array_A {

	public static void main(String[] args) {
		Integer array[] = {2,0,2,1,4,3,1,0,9,7,6,5,1,4};
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		int mapIndex = 0;
		for (int i = 0; i < array.length; i++) {
			ArrayList<Integer> al = new ArrayList<Integer>();	
			int arrayListIndex = 0;
			System.out.println("Value of i is "+i+" and its array-value of is "+array[i]);			
			al.add(arrayListIndex, array[i]);
			for (int j = i + 1; j < array.length; j++) {
				System.out.println("Value of j is "+j+" and its array-value of is "+array[j]);
				if (Collections.frequency(al, array[j]) == 0) {
					arrayListIndex++;						
					al.add(arrayListIndex,array[j]);
				} else {
					System.out.println("mapIndex is "+ mapIndex);					
					hm.put(mapIndex, al);
					mapIndex++;
					break;					
				}
				if (j + 1 == array.length) {
					System.out.println("mapIndex is "+ mapIndex);					
					hm.put(mapIndex, al);
					mapIndex++;					
				}
			}
			if (i + 1 == array.length) {
				System.out.println("mapIndex is "+ mapIndex);					
				hm.put(mapIndex, al);
				mapIndex++;					
			}			
		}
		System.out.println("Size of hashmap "+ hm.size());
		ArrayList<Integer> arrLst = new ArrayList<Integer>();
		for (Map.Entry<Integer, ArrayList<Integer>> entry : hm.entrySet()) {
			System.out.println("Size of array list at index " + entry.getKey() + " is " + entry.getValue().size());
			arrLst.add(entry.getKey(), entry.getValue().size());
		}
		Collections.sort(arrLst,Collections.reverseOrder());
		for (Map.Entry<Integer, ArrayList<Integer>> entry : hm.entrySet()) {
			if (entry.getValue().size()==arrLst.get(0)) {
				System.out.println("Largest sub array found");
				for (Integer integer : entry.getValue()) {
					System.out.print(integer + " ");
				}
			}
		}		
	}

}
