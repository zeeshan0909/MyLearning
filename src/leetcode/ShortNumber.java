package leetcode;

import java.util.Arrays;

class Number{
	public void number(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp = 0;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i :arr) {
			System.out.print(i + " ");
		}
	}
	
	public void number2(int[] nums) {
		int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // Swap nums[low] and nums[mid]
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap nums[mid] and nums[high]
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }
		for(int value :arr) {
			System.out.print(value + " ");
		}
	}
}
public class ShortNumber {

	public static void main(String[] args) {
		Number number = new Number();
		int[] arr = {2,0,2,1,1,0};
		number.number2(arr);
	}

}
