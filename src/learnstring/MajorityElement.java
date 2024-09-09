package learnstring;

class Element {
    public int majorityElement(int[] nums) {
        int count = 1;
        int max = nums[0];
        
        for(int i=1; i<nums.length; i++) {
        	if(max == nums[i]) {
        		count = count+1;
        	//	max = nums[i];
        	}else {
        		count = count-1;
        		if(count == 0) {
        			max = nums[i];
        			count = 1;
        		}
        	}
        }
        
    	return max;
    }
}


public class MajorityElement {
	public static void main(String[] args) {
		Element ele = new Element();
		int[] nums = {2,2,1,1,1,2,2,5,5,5,5,5,5,5};
		int ans = ele.majorityElement(nums);
		System.out.println(ans);
		
	}
}
