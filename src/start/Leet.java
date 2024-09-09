package start;

import java.util.HashMap;
import java.util.Map;

public class Leet {
	
	

	public int findMaxConsecutiveOnes(int[] nums) {
		
		HashMap<Integer, Integer> nn = new HashMap<>(); 
		
		
		int currentCount = 0;
		int maxCount = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				currentCount++;
			} else {
				maxCount = Math.max(currentCount, maxCount);
				currentCount = 0;
			}
		}
		maxCount = Math.max(currentCount, maxCount);
		return maxCount;
	}
/*	
Our last primitive data type related to integers is long.
           
long is the big brother of int. It’s stored in 64 bits of memory, so it can hold a significantly larger set of possible values.


freestar
The possible values of a long are between -9,223,372,036,854,775,808 (-263) to 9,223,372,036,854,775,807 (263 – 1).

We can simply declare one:

long l = 1_234_567_890;

long l;


	*/
	public static void main(String[] args) {
		Leet vv = new Leet();
		int[] arr =  {1,1,0,1,1,1};
		
		int ans = vv.findMaxConsecutiveOnes(arr);
		System.out.println(ans);
		char c = 65;
		System.out.println(c);
		int i = Integer.MAX_VALUE;
		int j = i + 1;
		// j will roll over to -2_147_483_648
		System.out.println(i);
		System.out.println(j);

		double d = Double.MAX_VALUE;
		double o = d + 1;
		System.out.println(d);
		System.out.println(o);
		// o will be Infinity
		
	}

}






