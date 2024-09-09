package leetcode;

public class MultiplyStrings {
	    public String multiply(String num1, String num2) {
	    	int n = num1.length();
	    	int m = num2.length();
	    	int[] array = new int[n+m];
	    	
	    	for(int i=n-1; i>=0; i--) {
	    		for(int j=m-1; j>=0; j--) {
	    			int ele1 = num1.charAt(i);
	    			int ele2 = num2.charAt(j);
	    			
	    			array[i + j + 1] = array[i + j + 1] + ele1 * ele2;
	    		}
	    	}
	    	
	    	int carry =0;
	    	for(int i=array.length-1; i>=0; i--){
	    		int temp = (array[i] + carry) % 10;
	    		carry = (array[i] + carry) / 10;
	    		array[i] = temp;
	    	}
	    	
	    	 StringBuilder sb = new StringBuilder();
	         for (int num : array) {
	             sb.append(num);
	         }
	         
	         while (sb.length() != 0 && sb.charAt(0) == '0') {
	             sb.deleteCharAt(0);
	         }
	         
	        return sb.length() == 0 ? "0" : sb.toString();
	        
	    }
	
	    public static void main(String[] args) {
			String s1 = "123";
			String s2 = "456";
			MultiplyStrings ms = new MultiplyStrings();
			String result = ms.multiply(s1, s2);
			System.out.println(result);
		}
}
