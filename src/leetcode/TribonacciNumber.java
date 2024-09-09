package leetcode;

import java.util.ArrayList;
import java.util.List;

class NewMain {
    public int tribonacci(int n) {
    	List<Integer> list = new ArrayList<>();
    	list.add(0);
    	list.add(1);
    	list.add(1);
    	
    	/* for (int i = 3; i <= n; i++) {
             int sum = list.get(i - 1) + list.get(i - 2) + list.get(i - 3);
             list.add(sum); // Add the new Tribonacci number to the list
         }
    	
    	return list.get(n);*/
    	int i=3;
    	while(i<=n) {
    		int sum =0;
    		for(int j=i-3; j<i; j++) {
    			sum = sum + list.get(j);
    		}
    		i++; 
    		list.add(sum);
    	}
        return list.get(n);
    }
}

public class TribonacciNumber {
	public static void main(String[] args) {
		NewMain ss = new NewMain();
		int n = 25;
		int ans = ss.tribonacci(n);
		System.out.println(ans);
	}

}


/*The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.*/

 
/*
Example 1:

Input: n = 4
Output: 4
 
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4


Example 2:

Input: n = 25
Output: 1389537*/
 