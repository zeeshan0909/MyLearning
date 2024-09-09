package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LargestOddString {

	public String largestOddNumber(String num) {
		int n = num.length() - 1;
		while (n >= 0) {
			int oddDigit = num.charAt(n);
			if (oddDigit % 2 != 0)
				return num.substring(0, n + 1);

			n--;
		}
		return "";
	}

	
	//FOR LONGESTCOMMONPREFIX...
	public String common(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		int len = Math.min(s1.length(), s2.length() );
		for(int i=0; i<len; i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				sb.append(s1.charAt(i));
			}else {
				break;
			}
				
		}
		return sb.toString();
	}
	
	public String longestCommonPrefix(String[] strs) {
		String preString = strs[0];
		for(int i=1; i<strs.length; i++) {
			preString = common(preString, strs[i]);
		}
	return preString;	
	}
	
	//FOR ISOMORPHIC 
	//IT FAIL IN SOME TEST CASES.
	/*public boolean isIsomorphic(String s, String t) {
		Set<Character> ss = new HashSet<>();
		Set<Character> st = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			ss.add(s.charAt(i));
		}
		for(int i=0; i<t.length(); i++) {
			st.add(t.charAt(i));
		}
		return ss.size() == st.size();
	}*/
	
	//BEST AND OPTIMAL APPROCH.
	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> ch = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			if (!ch.containsKey(s.charAt(i)) && !ch.containsValue(t.charAt(i))) {
                ch.put(s.charAt(i), t.charAt(i)); 
            } else if (!ch.containsKey(s.charAt(i))&& ch.containsValue(t.charAt(i))) {
            	return false;
            } else {
            	char valu = ch.get(s.charAt(i));
            	if(valu != t.charAt(i)) {
            		return false;
            	}
            }
		}
		return true;
	}
}
