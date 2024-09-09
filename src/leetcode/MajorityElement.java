package leetcode;

public class MajorityElement {

	public static void main(String[] args) {
		Major ref = new Major();
		int[]  nums = {3,2,3};
		int ans = ref.majorityElement2(nums);
		System.out.println(ans);
	}

}

class Major {
	 public int majorityElement(int[] nums) {
		 int max = nums[0];
		 int count =1;
		 for(int i=1; i<nums.length; i++) {
			 if(max == nums[i]) {
				 count++;
			 }else {
				 count--;
				 if(count == 0) {
					 max = nums[i];
					 count =1;
				 }
			 }
		 }
	       return max;
	 }   
	 public int majorityElement2(int[] nums) {
		 int max = nums[0]; 
		 int count = 0;     
		 for (int i = 1; i < nums.length; i++) {
		     if (nums[i] == nums[i - 1]) {
		         count++; 
		     } else {
		         if (count == 0) {
		             max = nums[i - 1]; 
		         }
		         count = 0;
		     }
		 }

		 
		 if (count == 0) {
		     max = nums[nums.length - 1];
		 }

		 return max;
		 
	 }
}