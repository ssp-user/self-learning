package revision;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, 7, 2, 5, 3, 1};
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Element at index " + i + " is " + nums[i]);
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Element at index " + i + " is " + nums[i]);
		}
	}

}
