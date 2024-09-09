package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class FindLeaders {
    static ArrayList<Integer> leaders(int n, int arr[]) {
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
        int CurrentLeader = arr[n-1]; 
        
        for(int i=n-1; i>=0; i--) {
        	
        	if(arr[i] >= CurrentLeader) {
        		CurrentLeader = arr[i];
        		list.add(CurrentLeader);
        	}
        	
        }
        Collections.reverse(list);
    	return list;
    }
}


public class LeadersInArray {
	public static void main(String[] args) {
		FindLeaders findleaders = new FindLeaders();
		int n = 6;
		int arr[] = {16,17,4,3,5,2};
		ArrayList<Integer> ll = findleaders.leaders(n, arr);
        for(int i : ll) {
            System.out.print(i + " ");
        }
	}

}
