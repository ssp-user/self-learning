package testcases;

import java.util.Arrays;

public class StringArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1[] = {"Vishal","Vanad","Samanyu","Suman","Akhilesh","Sidhima","Vikas"};
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
		System.out.println("Sort the arrays");
		Arrays.sort(str1);
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
		System.out.println("After sorting index " + Arrays.binarySearch(str1, "Akhilesh"));
		System.out.println("After sorting index " + Arrays.binarySearch(str1, "Vishal"));		
	}

}
