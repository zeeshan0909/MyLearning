package leetcode;

import java.util.*;


class LongestUniqueSubstring {
	
	//method for creating all the subString.
	public List<String> generateSubstrings(String s) {
        List<String> substrings = new ArrayList<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(s.substring(i, j));
            }
        }

        return substrings;
    }
	
	
	//method of check that all the char is unique in subString
	 public boolean isUnique(String s) {
	        Set<Character> charSet = new HashSet<>();
	        for (char c : s.toCharArray()) {
	            if (charSet.contains(c)) {
	                return false;
	            }
	            charSet.add(c);
	        }
	        return true;
	    }
	
	
	 //and this is for count or print the length of that unique subSting
	public int findLongestUniqueSubstringLength(String s) {
        List<String> allSubstrings = SubstringGenerator.generateSubstrings(s);
        int longest = 0;
        for (String sub : allSubstrings) {
            if (isUnique(sub)) {
                longest = Math.max(longest, sub.length());
            }
        }

        return longest;
    }

}

public class LongestSubString {
	public static void main(String[] args) {
		String s1 = "bbbbb";
		String s2 = "abcabcbb";
		String s3 = "pwwkew";
		
		LongestUniqueSubstring lus = new LongestUniqueSubstring();
		int n = lus.findLongestUniqueSubstringLength(s1);
		int m = lus.findLongestUniqueSubstringLength(s2);
		int o = lus.findLongestUniqueSubstringLength(s3);
		
		System.out.println(n);
		System.out.println(m);
		System.out.println(o);
	}

}
