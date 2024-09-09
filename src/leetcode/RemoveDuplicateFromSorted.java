package leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSorted {
	public static void main(String[] args) {
		RemoveDuplicateFromSorted obj = new RemoveDuplicateFromSorted();
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		int k = obj.remove(arr);
		System.out.println("The array after removing duplicate elements is ");
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public int remove2(int[] arr) {
		int k = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				arr[k] = arr[i];
				k++;
			}
		}
		return k;
	}

	public int remove(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int size = set.size();
		int j = 0;
		for (int var : set) {
			arr[j++] = var;
		}
		return size;
	}
}
