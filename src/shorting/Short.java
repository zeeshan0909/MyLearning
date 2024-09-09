package shorting;

public class Short {
	public void selection(int[] arr) {
		for(int i=0; i<arr.length-2; i++) {
			int min = i;
			for(int j=i; j<arr.length-1; j++) {
				if(arr[j] < arr[i]) {
					arr[min] = arr[j];
					min = j;
				}
			}
			int temp  = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {13, 46, 24, 52, 20, 9};
		Short ss = new Short();
		ss.selection(arr);
	}

}
