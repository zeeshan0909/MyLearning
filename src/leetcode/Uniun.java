package leetcode;

import java.util.Arrays;

public class Uniun {
	public static void main(String[] args) {
		Missing ref = new Missing();
		int[] nums = {9,6,4,2,3,5,7,0,1};
		int ans = ref.missingNumber(nums);
		System.out.println(ans);
	}

}

class Missing {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int missing  =0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != i) {
				missing = i;
			}
		}
		return missing;
	}
}

