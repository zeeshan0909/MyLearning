package leetcode;
class RightGretestElement{
	public int[] replaceElement(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int rightMax = arr[i+1];
			for(int j= i+1; j<n; j++) {
				if(arr[j] > rightMax) {
					rightMax = arr[j];
				}
			}
			arr[i] = rightMax;
		}
	}
}
public class ReplaceElementswithGreatestElementonRightSide {

	public static void main(String[] args) {
		RightGretestElement obj = new RightGretestElement();
		int[] arr = {17,18,5,4,6,1};
		obj.replaceElement(arr);
	}

}
