package leetcode;

class BestTime {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}

		int buy = prices[0];
		int sell = prices[0];
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < buy) {
				buy = prices[i];
				sell = prices[i];
			}
			if (prices[i] > sell) {
				sell = prices[i];
			}
			maxProfit = Math.max(maxProfit, sell - buy);
		}
		
		return maxProfit;
	}
}

public class Stock {

	public static void main(String[] args) {
		BestTime ref = new BestTime();
		int[] prices = { 2, 4, 1 };
		// output = 2;
		int ans = ref.maxProfit(prices);
		System.out.println(ans);

	}

}
