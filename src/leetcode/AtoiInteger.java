package leetcode;

class Demoo {
    public int myAtoi(String s) {
    	s = s.trim();
    	if(s.length() == 0) {
    		return 0;
    	}
    	
    	boolean chek = false;
    	long ans = 0;
    	for(int i=0; i<s.length(); i++) {
    		char ch = s.charAt(i);
    		
    		if(i == 0) {
    			if(ch == '-') {
    				chek = true;
    				continue;
    				
    			}else if(ch == '+') {
    				chek = false;
    				continue;
    			}
    		}
    		
    		if(ch >= '0' && ch <= '9') {
    			int digit = ch - '0' ;
    			ans = ans * 10 + digit;
    			
    			if(chek) {
    				long neg = -ans;
    				if(neg < Integer.MIN_VALUE) {
    					return Integer.MIN_VALUE;
    				}
    			}else {
    				if(ans > Integer.MAX_VALUE) {
    					return Integer.MAX_VALUE;
    				}
    			}
    			
    		}else {
    			break;
    		}
    	}
    	if(chek) {
    		ans = -ans;
    	}
    	
        return (int)ans;
    }
}

public class AtoiInteger {

	public static void main(String[] args) {
		Demoo sol = new Demoo();
		String ss =  "1337c0d3"; 
		int ans = sol.myAtoi(ss);
		System.out.println(ans);
	}

}
