package leetcode;

class Rotated {
    public boolean check(int[] nums) {
    	int n = nums.length;
    	int count =0;
    	for(int i=1; i<n-1; i++) {
    		if(nums[i] < nums[i-1]) {
    			count++;
    		}
    	}
    	if(nums[n-1] > nums[0]) {
    		count++;
    	}
    	
    	if(count > 1) {
    		return false;
    	}else {
    		return true;
    	}
       
    }
}




public class SortedRotated {
	public static void main(String[] args) {
		int [] nums = {1,2,3};
		Rotated ss = new Rotated();
		boolean ans = ss.check(nums);
		System.out.println(ans);
		
	}

}

