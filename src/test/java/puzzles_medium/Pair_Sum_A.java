package puzzles_medium;

public class Pair_Sum_A {

	public static void main(String[] args) {
		Integer arr[] = {8,7,2,5,3,1};
		int sum = 9;
		checkIndex(arr, sum);
	}
	public static void checkIndex(Integer array[],int desiredSum) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == desiredSum) {
					System.out.println("Pair found at index "+ i + " and "+ j);
				}
				
			}
		}
		
	}
}
