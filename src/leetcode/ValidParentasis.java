package leetcode;

import java.util.List;
import java.util.Stack;

class Valid {
    public boolean checkValidString(String s) {
    	int maxOpen = 0;
    	int minOpen = 0;
    	
    	for(char c : s.toCharArray() ) {
    		if(c == '(' ) {
    			maxOpen++;
        		minOpen++;
    		}else if(c == ')' ) {
    			maxOpen--;
        		minOpen--;
    		}else if(c == '*' ) {
    			maxOpen++;
        		minOpen--;
    		}
    		if(minOpen < 0) {
    			minOpen = 0;
    		}
    		if(maxOpen < 0) {
    			return false;
    		}
    	}
    	return minOpen == 0;
    }  
}

 
public class ValidParentasis {
	public static void main(String[] args) {
		Valid valid = new Valid();
		 
		String s =  "()" ;
		String s1 = "(*)" ;
		String s2 = "(*)))" ;
		
		boolean result = valid.checkValidString(s2);
		System.out.println(result);
				
	}

}     
