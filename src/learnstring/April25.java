package learnstring;

import java.util.ArrayList;
import java.util.List;

/*
You are given a string s consisting of lowercase letters and an integer k.
We call a string t ideal if the following conditions are satisfied:

t is a subsequence of the string s.

The absolute difference in the alphabet order of every two adjacent letters in t is less than or equal to k.
Return the length of the longest ideal string.

A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.

Note that the alphabet order is not cyclic. For example, the absolute difference in the alphabet order of 'a' and 'z' is 25, not 1.

 

Example 1:

Input: s = "acfgbd", k = 2
Output: 4
Explanation: The longest ideal string is "acbd". The length of this string is 4, so 4 is returned.
Note that "acfgbd" is not ideal because 'c' and 'f' have a difference of 3 in alphabet order.*/
class MyDemo {
	public List<String> allsubString(String s) {
		List<String> substrings = new ArrayList<>();
		int n = s.length();
		for(int i=0; i < (1 << n); i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<n; j++) {
				if((i & (1 << j)) != 0) {
					 sb.append(s.charAt(j));
				}
			}
			substrings.add(sb.toString());
		}
		return substrings;
}
	
	public boolean isIdealSubsequence(String t, int k) {
		for(int i=0; i<t.length()-1; i++) {
			int diff = Math.abs(t.charAt(i + 1) - t.charAt(i) );
			if(diff > k) {
				return false;
			}
			
		}
		return true;
	}

	public int longestIdealString(String s, int k) {
		int maxLength = 0;
		List<String> subsequences = allsubString(s);
		for(String sss : subsequences) {
			if(isIdealSubsequence(sss , k) ) {
				maxLength = Math.max(maxLength, sss.length() );
			}
		}
	return maxLength;
		
	}
}

public class April25 {
	public static void main(String[] args) {
		String s = "acfgbd";
		int k = 2;
		MyDemo mydemo = new MyDemo();
		int length = mydemo.longestIdealString(s, k);
		System.out.println("the length of the subsquence of the string is : " + length);
	}

}
