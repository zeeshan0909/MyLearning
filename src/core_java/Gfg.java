package core_java;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int print2largest(List<Integer> arr) {
        int larg = arr.get(0);
        int seclarg = arr.get(1);
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > larg){
                seclarg = larg;
                larg = arr.get(i);
            }else if(arr.get(i) > seclarg && arr.get(i) != larg) {
            	seclarg = arr.get(i);
            }
        }
       return seclarg;
    }
}


public class Gfg {

	public static void main(String[] args) {
		Solution ss = new Solution();
		List<Integer> arr = new ArrayList<>(); 
		arr.add(12);
		arr.add(35);
		arr.add(1);
		arr.add(90);
		arr.add(34);
		arr.add(1);
		arr.add(56);
		int ans = ss.print2largest(arr);
		System.out.println(ans);

	}

}
