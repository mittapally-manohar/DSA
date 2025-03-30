class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int i = 0; i <n;i++) {
             Arrays.fill(dp[i], Integer.MAX_VALUE - 1);
            dp[i][0]=0;
        }
         for (int j = 1; j <= amount; j++) {
            if (j % coins[0] == 0) {
                dp[0][j] = j / coins[0]; // Use only the first type of coin
            }
        }
        for(int i = 1; i < n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j], 1+dp[i][j-coins[i]]);
                }
            }
        }
        return (dp[n - 1][amount] == Integer.MAX_VALUE - 1) ? -1 : dp[n - 1][amount];
    }
}