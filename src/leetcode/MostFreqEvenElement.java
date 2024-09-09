package leetcode;

class MostEven {
    public int mostFrequentEven(int[] nums) {
        int maxCount =0;
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] % 2 == 0) {
        		int count =0;
        		for(int j=0; j<nums.length; j++) {
        			if(nums[i] == nums[j]) {
        				count++;
        			}
        		}
        		if(count > maxCount || (count == maxCount && nums[i] < ans) ) {
        			maxCount = count;
        			ans = nums[i];
        		}
        	}
        }
        	
		return ans;
    }
}

public class MostFreqEvenElement {
	public static void main(String[] args) {
		MostEven ref = new MostEven();
		int[] nums = {0,1,2,2,4,4,1};
				//Output: 2
		int ans = ref.mostFrequentEven(nums);
		System.out.println(ans);
	}

}


