class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 0;
        int maxProfit = 0;
        while (r < prices.length) {
            if (prices[r] > prices[l]){
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
               
            }else {
                l = r;
            }
             r++;
        }
        return maxProfit;
    }
}