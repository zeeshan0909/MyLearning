package leetcode;

class Rotation {
    public void rotate(int[] nums, int k) {
    	int n = nums.length;
      	while(k > 0) {
    		int temp = nums[n-1];
    		for(int i=n-1; i>0; i--) {
    			nums[i] = nums[i-1];
    		}	
    		nums[0] = temp;
    		 for (int num : nums) {
    	            System.out.print(num + " ");
    	        }
    	        System.out.println();

    		k--;
    	}
        
    }
}



public class LeftRotationByOne {

	public static void main(String[] args) {
		Rotation ref = new Rotation();
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		ref.rotate(nums, k);

	}

}



//Input int[] arr = {1,2,3,4,5,6,7};  k=3; arr.length == 6;

// {7,1,2,3,4,5,6}

//{6,7,1,2,3,4,5}

//{5,6,7,1,2,3,4,}

//Output: [5,6,7,1,2,3,4]

