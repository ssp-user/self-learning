package revision;

import java.util.HashMap;
import java.util.Map;

public class TestArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, 7, 2, 5, 3, 1};
		int target = 9;
		findSum(nums, target);
	}
	
	public static void findSum(int[] arr, int tar) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(tar - arr[i])==true) {
				System.out.printf("**Pair Exists** (%d, %d) " + arr[i] , (tar - arr[i]));
				return;
			}
			map.put(arr[i], null);
			System.out.println("Pair does not exists");
		}
	}

}
