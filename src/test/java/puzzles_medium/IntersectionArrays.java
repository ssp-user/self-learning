package puzzles_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntersectionArrays {

	public static void main(String[] args) {
		Integer arr1[] = {21, 34, 41, 22, 35};
		Integer arr2[] = {61, 34, 45, 21, 11};	
		List <Integer> arrList1 = new ArrayList<Integer>(Arrays.asList(arr1));
		List <Integer> arrList2 = new ArrayList<Integer>(Arrays.asList(arr2));
//		Collections.sort(arrList1);
		//Collections.sort(arrList2);		
		//arrList1.stream().forEach(ele -> System.out.println(ele));
		System.out.println("***********************************");
//		arrList2.stream().forEach(ele -> System.out.println(ele));
//		System.out.println(arrList1.equals(arrList2));
//		arrList2.removeAll(arrList1);
		arrList2.retainAll(arrList1);
		System.out.println("***********************************");		
		arrList2.stream().forEach(ele -> System.out.println(ele));
	}

}
