package leetcode;

import java.util.ArrayList;
import java.util.List;

class Rearrange {
    public int[] rearrangeArray(int[] nums) {
    	 List<Integer> neg = new ArrayList<>();
         List<Integer> pos = new ArrayList<>();
       
         for(int i = 0; i < nums.length; i++) {
             if(nums[i] < 0) {
                 neg.add(nums[i]);
             } else {
                 pos.add(nums[i]);
             }
         }
         int posIndex = 0;
         int negIndex = 0;
         for(int i = 0; i < nums.length; i++) {
             if(i % 2 == 0) {
                 nums[i] = pos.get(posIndex++);
             } else {
                 nums[i] = neg.get(negIndex++);
             }
         }
         
         return nums;
    }
    
    public int[] rearrangeArray2(int[] nums) {
    	int result[] = new int[nums.length];
    	int pos = 0;
    	int neg = 1;
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i] < 0) {
    			 result[neg] = nums[i];
    			neg = neg + 2;
    		}else {
    			 result[pos] = nums[i];
    			pos = pos + 2;
    		}
    	}
    	return result;
    }
    
}

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        Rearrange rearrange = new Rearrange();
        int[] nums = {3, 1, -2, -5, 2, -4};
        /*Output: [3,-2,1,-5,2,-4]
        Explanation:
        The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
        The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
        Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they 
        do not satisfy one or more conditions.*/
        int[] ans = rearrange.rearrangeArray2(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
