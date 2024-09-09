/*Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]*/

package leetcode;

import java.util.ArrayList;
import java.util.List;

class MyDemo {
	public List<List> subsets(int[] nums) {
		List<List> list = new ArrayList<>();
		List<Integer> inner = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					inner.add(nums[i]);
					list.add(new ArrayList<>(inner) );
				}else {
					inner.add(nums[i]);
					inner.add(nums[j]);
					list.add(new ArrayList<>(inner) );
				}
				
			}
		}
		List<Integer> blank = new ArrayList<>();
		List<Integer> full = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			full.add(i);
		}
		list.add(new ArrayList<>(full) );
		list.add(new ArrayList<>(blank) );
		return list;
	}
	

}

public class SubSet {
	public static void main(String[] args) {
		MyDemo ref = new MyDemo();
		int[] nums = { 1, 2, 3 };

	}
}
