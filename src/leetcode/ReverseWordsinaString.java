package leetcode;

import java.util.Stack;

class Solution2 {
	public String reverseWords(String s) {
		Stack<String> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(String e : s.split("\\s+")) {
			st.push(e);
		}
		while(!st.isEmpty()) {
			sb.append(st.pop()).append(" ");
		}
		return sb.toString().trim();
	}
}

public class ReverseWordsinaString {
	public static void main(String[] args) {
		Solution2 ref = new Solution2();
		String  s = "the sky is blue";
		String ans = ref.reverseWords(s);
		System.out.println(ans);
	}

}
