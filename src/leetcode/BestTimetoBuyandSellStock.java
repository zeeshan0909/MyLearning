/*You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/


package leetcode;

class MarketStock {
    public int maxProfit(int[] prices) {
    	int min = Integer.MAX_VALUE;
    	int pro = 0;
    	for(int e : prices) {
    		if(e < min) {
    			min = e;
    			
    		}else if(e - min > pro) {
    			pro = e - min;
    		}
    	}
    	return pro;
    }
}

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		MarketStock  ref = new MarketStock ();
		int[] prices =  {7,6,4,3,1};
		int ans = ref.maxProfit(prices);
		System.out.println(ans );
	
	}

}
