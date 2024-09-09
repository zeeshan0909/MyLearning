package start;

import java.util.Stack;
 
public class ValidParentheses {
    public boolean isValid(String s) {
       Stack<Character> ss = new Stack<>();
       for(char ch : s.toCharArray()) {
    	   if(ch == '(') {
    		   ss.push(')');
    	   }else if(ch == '[') {
    		   ss.push(']');
    	   }else if(ch == '{') {
    		   ss.push('}');
    	   }else if(ss.isEmpty() || ss.pop() != ch) {
    		   return false;
    	   }
       }
       return ss.isEmpty();
    }
    public static void main(String[] args) {
    	ValidParentheses vp = new ValidParentheses();
    	String ss = "(]";
    	String s = "()[]{}";
		System.out.println(vp.isValid(ss));
		System.out.println(vp.isValid(s));
	}
}
