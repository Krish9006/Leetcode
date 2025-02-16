class Solution {
    public int change(int amount, int[] coins) {
         int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1); 
        }
        return solve(n - 1, coins, amount, dp);
    }
    private int solve(int i, int[] coins, int target, int[][] dp) {
        if (target == 0) {
            return 1;
        }
        if (i < 0) {
            return 0;
        }
        if (dp[i][target] != -1) {
            return dp[i][target];
        }
        int exclude = solve(i - 1, coins, target, dp);
        int include = 0;
        if (coins[i] <= target) {
            include=solve(i,coins,target-coins[i],dp);
        }
        dp[i][target] = exclude + include;
        return dp[i][target];
    }
}