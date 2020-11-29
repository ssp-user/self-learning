package puzzles_medium;

import java.util.Arrays;
import java.util.Collections;

public class Sort_A {

	public static void main(String[] args) {
		Integer[] a = {1,0,1,0,1,0,0,1};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}	
		System.out.println();		
		Arrays.sort(a,Collections.reverseOrder());
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}				
	}

}
