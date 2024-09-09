package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {

	public String frequencySort(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			}else {
				map.put(ch, 1);
			}
		}
		List<Character> list = new ArrayList<>(map.keySet());
		Collections.sort(list, (a, b) -> map.get(b) - map.get(a) );
		StringBuilder sb = new StringBuilder();
		for(char c : list) {
			for(int i=0; i<map.get(c); i++) {
				sb.append(c);
			}
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		String s = "tree";
		SortCharactersByFrequency obj = new SortCharactersByFrequency();
		System.out.println(obj.frequencySort(s));
	}

}
