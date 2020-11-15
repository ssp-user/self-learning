package testcases;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimitivetoIntegerArray {

	public static void main(String[] args) {
		int arr[] = {9,4,6,7,4};
		ArrayList al = new ArrayList();
		Integer newArr[] = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
			al.add(arr[i]);
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		System.out.println("");
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

}
