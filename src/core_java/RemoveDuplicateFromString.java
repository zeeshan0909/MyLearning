package core_java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String ss = "aaabbbcaccddaesz";
		Set<Character> sc = new HashSet<>();
		for(char value : ss.toCharArray() ) {
			if(sc.contains(value) ) {
				continue;
			}else {
				sc.add(value);
				System.out.print(value + " ");
			}
		}
		
	}
	

}
