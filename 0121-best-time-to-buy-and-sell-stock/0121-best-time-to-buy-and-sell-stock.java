class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int left = 0, right = 1; right < prices.length; right++) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
        }
        return maxProfit;
    }
}