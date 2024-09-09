package leetcode;

class Solve {
    public int missingNumber(int[] nums) {

      int n = nums.length;
      int sum1 = n*(n+1)/2 ;
      int sum2 = 0;
      for(int i=0; i<nums.length; i++) {
    	  sum2 = sum2 + nums[i];
      }
       
       return sum1 - sum2;
    }
}



public class MissingNumber {
	public static void main(String[] args) {
		Solve ref = new Solve();
		//int[] arr = {9,6,4,2,3,5,7,0,1};
		
		//int[] arr = {8,9,4,2,3,5,7,6,1};
		int[] arr = {0,1};
		
		int ans = ref.missingNumber(arr);
		System.out.println(ans);
	}

}
