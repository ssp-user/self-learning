package puzzles_medium;

import java.util.Arrays;

public class Pair_Sum_B {

	public static void main(String[] args) {
		Integer arr[] = {8,7,2,5,3,1};
		int sum = 15;
		findPair(arr, sum);
	} 
	public static void findPair(Integer array[],int desiredSum) {
		Arrays.sort(array);
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			if (array[low] + array[high]==desiredSum) {
				System.out.println("Pair found");
				return;
			}
			if (array[low] + array[high] < desiredSum) {
				low++;
			}
			else {
				high--;
			}
		}
		System.out.println("Pair not found");
	}
}
