package leetcode;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class A {

	public List<String> allSubString(String s) {
        List<String> lis = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                lis.add(s.substring(i, j));
            }
        }
        return lis;
    }
	
	
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
	 
	 
	 public int lengthOfLongestSubstring(String s) {
	        List<String> list = allSubString(s);
	        int n = 0;
	        for (String sub : list) {
	            if (isUnique(sub)) {
	                n = Math.max(n, sub.length());
	            }
	        }
	        return n;
	    }



}
public class SubstringGenerator {
	public static void main(String[] args) {
		String s = "abcabcbb";
		A ss = new A();
		int m = ss.lengthOfLongestSubstring(s);
		System.out.println(m);
	}

	public static List<String> generateSubstrings(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}


