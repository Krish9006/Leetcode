class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length, n = dungeon[0].length;
        int[][] dp = new int[m][n];  
        return solve(0, 0, dungeon, dp);
    }

    private int solve(int i, int j, int[][] dungeon, int[][] dp) {
        int m = dungeon.length, n = dungeon[0].length;
        if (i == m - 1 && j == n - 1) return Math.max(1, 1 - dungeon[i][j]);
        if (dp[i][j] != 0) return dp[i][j];

        int minHealth = Integer.MAX_VALUE;
        if (i + 1 < m) minHealth = Math.min(minHealth, solve(i + 1, j, dungeon, dp));
        if (j + 1 < n) minHealth = Math.min(minHealth, solve(i, j + 1, dungeon, dp));

        dp[i][j] = Math.max(1, minHealth - dungeon[i][j]);
        return dp[i][j];
    }
}
