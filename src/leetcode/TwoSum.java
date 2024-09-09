package leetcode;

import java.util.HashMap;
import java.util.Map;

class Sum {
	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println(i +" " +j);
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return null;
	}
}

public class TwoSum {
	public static void main(String[] args) {
		Sum s = new Sum();
		int[] nums = {3,2,4};
		int target = 6;
		int[] ans = new int[2];
		ans = s.twoSum(nums, target);
	}

}
