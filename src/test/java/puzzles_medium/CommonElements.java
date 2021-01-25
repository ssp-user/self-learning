package puzzles_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
		Integer [] arr1 = {1, 5, 10, 20, 40, 80};
		Integer [] arr2 = {6, 7, 20, 80, 100};
		Integer [] arr3 = {3, 4, 15, 20, 30, 70, 801, 12};
		List<Integer> arrLst1 = new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> arrLst2 = new ArrayList<Integer>(Arrays.asList(arr2));
		List<Integer> arrLst3 = new ArrayList<Integer>(Arrays.asList(arr3));		
		System.out.println(arrLst1);
		System.out.println(arrLst2);
		System.out.println(arrLst3);	
		arrLst2.removeAll(arrLst1);
		System.out.println(arrLst2);		
/*		arrLst1.retainAll(arrLst2);
		System.out.println(arrLst1);
		arrLst1.retainAll(arrLst3);
		System.out.println(arrLst1);	
		System.out.println(arrLst2);
		System.out.println(arrLst3);*/		
	}

}
