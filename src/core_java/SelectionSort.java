package core_java;

class Sort{
	public void Incressing(int array[], int n) {
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(array[j] < array[min]) {
					min = j;
						
				}
				int temp = array[i];
				array[i] = array[min];
				array[min] =temp;
			}
		}
				
	}
	
	public void decreassing(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			int max = i;
			for(int j=i+1; j<n; j++) {
				if(arr[max] < arr[j]) {
					max = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			
		}
	}
}



public class SelectionSort {
	public static void main(String[] args) {
		 Sort ss = new Sort();
		 int arr[] =  {20,19,15, 17, 12, 23, 13};
		 int n = arr.length;
		 ss.Incressing(arr, n);
		 for(int i=0; i<n; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 System.out.println();
		 ss.decreassing(arr, n);
		 for(int i=0; i<n; i++) {
			 System.out.print(arr[i] + " ");
		 }
	}

}
