package core_java;

import java.util.ArrayList;
import java.util.List;

public class LongString {
	public static void main(String[] args) {
		List<String> ll = new ArrayList<>();
		

		ll.add("hiiii");
		ll.add("zeeshan");
		ll.add("ThisOneIsTheLogestString");
		ll.add("Ansari");
		ll.add("javaDeveloper");
		
		
		
		String max = ll.get(0);
		for(int i=1;  i<ll.size(); i++) {
			if(ll.get(i).length() > max.length()) {
				max = ll.get(i);
			}
		}
		System.out.println(max);
		
	}

}
