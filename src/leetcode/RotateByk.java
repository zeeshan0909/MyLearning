package leetcode;

public class RotateByk {
	public static void main(String[] args) {
		/*RotateByk obj = new RotateByk();
		int[] arr = {10,20,30,40,90,80};
		obj.rotateByOne(arr);
		System.out.println("The array after removing duplicate elements is ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}*/
		RotateByk obj2 = new RotateByk();
		int[] arr = {-1,-100,3,99};
		int k = 2;
		obj2.rotakeByk(arr, k);
		System.out.println("++++++++++++++++");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
	}
	
	//rotate by one
	public int[] rotateByOne(int[] arr) {
		int temp = arr[0];
		int n = arr.length;
		for(int i=1; i<n; i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = temp;
		
		return arr;
	}
	
	//rotate by k
	public int[] rotakeByk(int[] arr, int k) {
		int n = arr.length;
		int[] temp = new int[n];
		for(int i=0; i<n; i++) {
			temp[(i+k) % n ] =  arr[i];
		}
		for(int j=0; j<temp.length; j++) {
			arr[j] =  temp[j];
		} 
		return arr;
	}
}
