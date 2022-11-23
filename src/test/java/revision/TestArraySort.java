package revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, 7, 2, 5, 9, 10};
		int target = 19;
		findPair(nums, target);
	}
	
	public static void findPair(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				System.out.printf("Pair found (%d, %d)", nums[map.get(target - nums[i])], nums[i]);
				System.out.println("\nSize of hashMap is "+ map.size());
				return;
			}
			map.put(nums[i], i);		
		}
		System.out.println("Pair not found");
		System.out.println("Size of hashMap is "+ map.size());
	}
}
