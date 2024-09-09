package leetcode;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		MaxOne ref = new MaxOne();
		int [] nums = {1,0,1,1,0,1};
		int ans = ref.findMaxConsecutiveOnes(nums);
		System.out.println(ans);
	}

}

class MaxOne {
	public int findMaxConsecutiveOnes(int[] nums) {
		int count =0;
		int total = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 1) {  
				count++;
				
			}else {
				total = Math.max(count, total);
		    	count = 0;
			}
		}
		return total;
	}
}