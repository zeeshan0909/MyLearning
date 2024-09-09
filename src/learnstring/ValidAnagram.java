package learnstring;

import java.util.HashMap;
import java.util.Map;

class Anagram {
	public boolean isAnagram(String s, String t) {
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		Map<Character, Integer> mp2 = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			if(mp.get(s.charAt(i)) != null ) {
				mp.put(s.charAt(i), mp.get(s.charAt(i))+1 );
			}else {
				mp.put(s.charAt(i), 1);
			}
			
		}
		for(int i=0; i<t.length(); i++) {
			if(mp2.get(t.charAt(i)) != null ) {
				mp2.put(t.charAt(i), mp2.get(t.charAt(i))+1 );
			}else {
				mp2.put(t.charAt(i), 1);
			}
			
		}
		if(mp.equals(mp2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		return false;
	}
}

public class ValidAnagram {
	public static void main(String[] args) {
		String s = "aca";
		String t = "zzz";
		Anagram obj = new Anagram();
		obj.isAnagram(s, t);
	}

}
