package leetcode;

import java.util.HashSet;
import java.util.Set;

class Single {
	public int singleNumber(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					ans = nums[i];
				}
			}

		}
		return ans;
	}
	
	public int singleNumber2(int[] nums) {
		 Set<Integer> set = new HashSet<>();
	     for(int i : nums){
	         if(set.contains(i)){
	             set.remove(i);
	         }else{
	             set.add(i);
	         }
	     }
	     return set.iterator().next();
	}

}


public class SingleNumber {

	public static void main(String[] args) {
		Single ref = new Single();
		int[] nums = {4,1,2,1,2};
		int ans = ref.singleNumber2(nums);
		System.out.println(ans);

	}

}
