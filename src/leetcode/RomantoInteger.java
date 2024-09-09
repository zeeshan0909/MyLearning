package leetcode;

import java.util.HashMap;
import java.util.Map;

/*Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

*/

class Main {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int pval =0;
        int ans =0;

        for(int i=s.length()-1; i>=0; i--) {
        	int value = map.get( s.charAt(i) );
        	
        	if(value >= pval) {
        		ans = ans + value; 
        				
        	}else {
        		ans = ans - value;
        		pval = value;
        	}
        }
        return ans;
    }
}


public class RomantoInteger {
	
	public static void main(String[] args) {
		Main obj1 = new Main();
		String s = "IIIV";
		int res = obj1.romanToInt(s);
		System.out.println(res);
	}

}
