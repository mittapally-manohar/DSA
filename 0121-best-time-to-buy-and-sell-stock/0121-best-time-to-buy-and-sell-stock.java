class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        for (int i = 0,j=0; j < n; j++){
           if (prices[j] > prices[i]) {
            profit = Math.max(profit, prices[j] - prices[i]);
           } else {
            i = j;
           }
        }
        return profit;
    }
}