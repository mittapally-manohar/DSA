class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxAmount = 0;
        for(int[] account : accounts) {
            int sum = 0;
            for(int money : account) {
                sum += money;
            }
            maxAmount = Math.max(sum, maxAmount);
        }
        return maxAmount;
    }
}