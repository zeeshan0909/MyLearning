package leetcode;

class subArray{
	public int maxSubArray(int[] nums) {
		 int size = nums.length;
	        int max = Integer.MIN_VALUE;
	        int sum = 0;
	        for (int i = 0; i < size; i++) {
	        	sum = sum + nums[i];
	            if (max < sum)
	            	max = sum;
	            if (sum < 0)
	            	sum = 0;
	        }
	        return max;
	}
}

public class MaximumSubarray {
	public static void main(String[] args) {
		subArray ref = new subArray();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = ref.maxSubArray(nums);
		System.out.println(ans);
	}

}
