class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1); 
        }
        int result = solve(n - 1, coins, amount, dp);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
    private int solve(int i, int[] coins, int target, int[][] dp) {
        if (target == 0) {
            return 0;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][target] != -1) {
            return dp[i][target];
        }
        int exclude = solve(i - 1, coins, target, dp);
        int include = Integer.MAX_VALUE;
        if (coins[i] <= target) {
            int subResult = solve(i, coins, target - coins[i], dp);
            if (subResult != Integer.MAX_VALUE) {
                include = 1 + subResult;
            }
        }
        dp[i][target] = Math.min(exclude, include);
        return dp[i][target];
    }
}