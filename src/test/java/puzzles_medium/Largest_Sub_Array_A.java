package puzzles_medium;

import java.util.ArrayList;
import java.util.Collections;

public class Largest_Sub_Array_A {

	public static void main(String[] args) {
		Integer array[] = {2,0,2,1,4,3,1,0};
		ArrayList al = new ArrayList();
		for (int i = 0; i < array.length; i++) {
			al.add(i, array[i]);
		}
	}
	public static boolean elementAlreadyExists(ArrayList<Integer> al,int element) {
		if (Collections.frequency(al, element) > 0) {
			return true;
		}
		else {
			return false;			
		}
	}	

}
