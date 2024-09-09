/*Given a string s, return the longest 
palindromic
 
substring
 in s.
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"*/

package leetcode;

import java.util.ArrayList;
import java.util.List;

class New {
	 private boolean isPalindrome(String s) {
	        int left = 0, right = s.length() - 1;
	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

	 public List<String> findAllSubstrings(String s) {
	        List<String> substrings = new ArrayList<>();
	        for (int i = 0; i < s.length(); i++) {
	            for (int j = i + 1; j <= s.length(); j++) {
	                substrings.add(s.substring(i, j));
	            }
	        }
	        return substrings;
	    }
	
	public String longestPalindrome(String s) {
		List<String> list = findAllSubstrings(s);
		 String longestPalindrome = "";
		 for(String i : list) {
			 if(isPalindrome(i) && i.length() > longestPalindrome.length() ) {
				 longestPalindrome = i;
			 }
		 }
		
		return longestPalindrome;
	}
	
}

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		New nn = new New();
		String s = 
				"000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
				+ ""
				+ "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
				+ "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
				+ "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000";
		String ans = nn.longestPalindrome(s);
		System.out.println(ans);
	}

}
