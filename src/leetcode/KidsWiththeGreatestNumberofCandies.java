package leetcode;

import java.util.ArrayList;
import java.util.List;

class Demoooo {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	int n = candies.length;
    	int target = candies[0];
    	for(int i=1; i<n; i++) {
    		if(candies[i] >= target) {
    			target = candies[i];
    		}
    	}
    	 List<Boolean> result = new ArrayList<>(n);
    	for(int i=0; i<n; i++) {
    		
    		result.add(candies[i] + extraCandies >= target);
 
    	}
        return result;
    }
}

public class KidsWiththeGreatestNumberofCandies {

	public static void main(String[] args) {
		Demoooo ref = new Demoooo();
		int  candies[] =   {2,3,5,1,3};
		int extraCandies = 3;
		 //ref.kidsWithCandies(candies, extraCandies);
		System.out.println(ref.kidsWithCandies(candies, extraCandies) );
		
	}

}
