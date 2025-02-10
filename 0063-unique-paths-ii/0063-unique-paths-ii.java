import java.util.Arrays;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(n - 1, m - 1, obstacleGrid, dp);
    }

    private int solve(int i, int j, int[][] obstacleGrid, int[][] dp) {
        if (i < 0 || j < 0 || obstacleGrid[i][j] == 1) return 0;
        if (i == 0 && j == 0) return 1;
        if (dp[i][j] != -1) return dp[i][j];
        dp[i][j] = solve(i - 1, j, obstacleGrid, dp) + solve(i, j - 1, obstacleGrid, dp);
        return dp[i][j];
    }
}
