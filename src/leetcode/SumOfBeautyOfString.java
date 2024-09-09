package leetcode;

import java.util.ArrayList;
import java.util.List;

class MyMain {
	/*public int beautySum(String s) {
		int n = s.length();
		int ans = 0;
		for (int i = 0; i<n; i++) {
			int fre[] = new int[26];
			for (int j=i; j<n; j++) {
				fre[s.charAt(j) - 'a'] ++ ; 
				int mx = getMax(fre);
				int mi = getMin(fre);
				int buety = mx - mi;
				ans += buety;
			}
		}
		return ans;
	}

	public int getMax(int fre[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<26; i++) {
			if(fre[i] != 0) {
				max = Math.max(max, fre[i]);
			}
		}
		return max;
	}

	public int getMin(int fre[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<26; i++) {
			if(fre[i] != 0) {
				min = Math.min(min, fre[i]);
			}
		}
		return min;
	}*/

public int beautySum(String s) {
	int ans =0;
	int n =s.length();
	for(int i=0; i<n; i++) {
		int freq[] = new int[26];
		for(int j=i; j<n; j++) {
			freq[s.charAt(j) -'a'] ++;
			int min = getMin(freq);
			int max = getMax(freq);
			int beuty = max - min;
			ans = ans + beuty;
		}
	}
	return ans;
	
}
public int getMax(int fre[]) {
	int max = Integer.MIN_VALUE;
	for(int i=0; i<26; i++) {
		if(fre[i] != 0) {
			max = Math.max(max, fre[i]);
		}
	}
	return max;
}
public int getMin(int fre[]) {
	int min = Integer.MAX_VALUE;
	for(int i=0; i<26; i++) {
		if(fre[i] != 0) {
			min = Math.min(min, fre[i]);
		}
	}
	return min;
}

}

public class SumOfBeautyOfString {
	public static void main(String[] args) {
		MyMain ref = new MyMain();
		String s = "aabcb";
		int ans = ref.beautySum(s);
		System.out.println(ans);
	}
}






































