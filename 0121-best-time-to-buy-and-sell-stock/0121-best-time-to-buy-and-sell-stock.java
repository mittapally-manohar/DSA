class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n  = prices.length;
        int slow = 0;
        int fast = 1;
        while (fast < n) {
            if (prices[fast] > prices[slow]) {
                maxProfit = Math.max(maxProfit, prices[fast]-prices[slow]);
            }else {
                slow = fast;
            }
            fast++;
        }
        return maxProfit;
    }
}