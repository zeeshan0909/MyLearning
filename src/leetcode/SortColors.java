package leetcode;

public class SortColors {

	public static void main(String[] args) {
		Colors ref = new Colors();
		int[] nums = {2,0,2,1,1,0};
		ref.sortColors2(nums);
		for(int e : nums) {
			System.out.print(e + " ");
		}

	}

}
class Colors {
    public void sortColors(int[] nums) {
    	for(int i=0; i<nums.length; i++) {
    		for(int j=i+1; j<nums.length; j++) {
    			if(nums[j] <= nums[i]) {
    				int temp = nums[i];
    				nums[i] = nums[j];
    				nums[j] = temp;
    			}
    		}
    	}
        
    }
    
    public void sortColors2(int[] nums) {
    	int zero=0;
    	int one=0;
    	int two=0;
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i] == 0) {
    			zero++;
    		}else if(nums[i] == 1) {
    			one++;
    		}else {
    			two++;
    		}
    	}
    	for(int i=0; i<zero; i++) {
    		nums[i] = 0;
    	}
    	for(int i=zero; i<zero+one; i++) {
    		nums[i]=1;
    	}
    	for(int i=zero+one; i<nums.length; i++) {
    		nums[i]=2;
    	}
    }
}