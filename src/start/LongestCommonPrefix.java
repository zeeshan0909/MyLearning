package start;

public class LongestCommonPrefix {
	private String common(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		int l = Math.min(s1.length(), s2.length());
		for(int i=0; i<l; i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				sb.append(s1.charAt(i));
			}else 
				break;
		}
		return sb.toString();
	}
    public String longestCommonPrefix(String[] strs) {
    	String prefix = strs[0];
    	for(int i=0; i<strs.length; i++) {
    		prefix = common(prefix, strs[i]);
    	}
    	
    return prefix;   
    }
    
    public static void main(String[] args) {
    	LongestCommonPrefix lcf = new LongestCommonPrefix();
    	String[] ssss = {"flower", "flow", "flight"};
    	System.out.println(lcf.longestCommonPrefix(ssss));
		
	}
}