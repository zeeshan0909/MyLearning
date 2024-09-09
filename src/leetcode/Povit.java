package leetcode;

class Pivotfind {
	public int pivotIndex(int[] nums) {
		int total = 0;
		int leftSum =0;
		int n = nums.length;
		for (int i=0; i<n; i++) {
			total += nums[i];
		}
		
		for(int i=0; i<n; i++) {
			if(2*leftSum + nums[i] == total) {
				return i;
			}
			leftSum += nums[i];
		}
		return -1;
	}
}

public class Povit {
	public static void main(String[] args) {
		Pivotfind ss = new Pivotfind();
		int arr[] = {2,1,-1};
		int ans = ss.pivotIndex(arr);
		System.out.println(ans);
	}

}
