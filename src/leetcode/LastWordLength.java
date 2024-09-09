package leetcode;

class DemoClass {
    public int lengthOfLastWord(String s) {
    	// Split the string using one or more spaces as the delimiter
        String[] words = s.split("\\s+");
        if(words.length == 0) {
        	return 0;
        }else {
        	String lstWord = words[words.length - 1];
        	return lstWord.length();
        }
    }
}
public class LastWordLength {
	public static void main(String[] args) {
		Demo OBJ = new Demo();
		String s = "Hello World programming omkar       zeeshan";
		int ans = OBJ.lengthOfLastWord(s);
		System.out.println(ans);
	}

}
/*
class Solution {
    public int lengthOfLastWord(String s) {
        // Split the string using one or more spaces as the delimiter
        String[] words = s.split("\\s+");
        
        // Check if there are any words in the array
        if (words.length == 0) {
            return 0; // If no words found, return 0
        } else {
            // Get the last word
            String lastWord = words[words.length - 1];
            // Return the length of the last word
            return lastWord.length();
        }
    }
}

public class LastWordLength {
    public static void main(String[] args) {
        Solution ss = new Solution();
        String s = "Hello World";
        int ans = ss.lengthOfLastWord(s);
        System.out.println(ans);
    }
}
*/