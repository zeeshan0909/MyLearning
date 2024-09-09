package leetcode;

class Zero {
	public void moveZeroes(int[] nums) {
		int len = nums.length;
		int k = 0;
		for(int i=0; i<nums.length; i++) {
			System.out.println("now value of k is : " + k );
			
			System.out.println(i + " index pr value " + nums[i]);
			if(nums[i] != 0) {
				System.out.println("in if block value of nums[i] is : " + nums[i] );
				nums[k++] = nums[i];
				System.out.println("update value of k is : " + nums[k] );
				
			}else {
				continue;
			}
			
		}
		
		while(k <= len) {
			nums[k] = 0;
		}
		
		for(int i : nums) {
			System.out.print(i+",");
		}
	}
}

public class MoveZeros {
	public static void main(String[] args) {
		/*
		 * Given an integer array nums, move all 0's to the end of it while maintaining
		 * the relative order of the non-zero elements.
		 * 
		 * Note that you must do this in-place without making a copy of the array.
		 */
		Zero ref = new Zero();
		int[] nums = { 0, 1, 0, 3, 12 };
		ref.moveZeroes(nums);
	}

}

//que = {0, 1, 0, 3, 12}
//
// ans = [1 ,3, 12, 0, 0]