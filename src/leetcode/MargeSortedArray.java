package leetcode;

public class MargeSortedArray {
	public void merg(int[] num1, int n, int[] num2, int m) {
		
		int i=0; 
		int j=0;
		int k=0;
		
		int[] res = new int[m+n];
		while(i < m && j < n) {
			if(num1[i] < num2[j]) {
				res[k++] = num1[i++];
			}else {
				res[k++] = num2[j++];
			}
		}
		while(i<n) {
			res[k++] =  num1[i++];
		}
		
		while(j<m) {
			res[k++] = num2[j++];
		}
		
		for (int idx = 0; idx < m + n; idx++) {
            num1[idx] = res[idx];
        }
		
	}    
	
	public static void main(String[] args) {
		int n = 6;
		int m = 3;
		int[] arr = new int[]{1, 2, 3, 0, 0, 0};
		int[] arr2 = new int[]{2, 5, 6};
		MargeSortedArray obj = new MargeSortedArray();
		obj.merg(arr, n, arr2, m);
		
		for(int num : arr) {
			System.out.println(num + "");
		}
		
	}

}
