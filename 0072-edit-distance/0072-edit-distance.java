class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
      for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(n, m, word1, word2, dp);
    }
    private int solve(int i, int j, String word1, String word2, int[][] dp) {
        if (i == 0) return j; 
        if (j == 0) return i; 
        if (dp[i][j] != -1) return dp[i][j];
        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
            dp[i][j] = solve(i - 1, j - 1, word1, word2, dp);
        } else {
            int insert = solve(i, j - 1, word1, word2, dp);
            int delete = solve(i - 1, j, word1, word2, dp);
            int replace = solve(i - 1, j - 1, word1, word2, dp);
            dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
        }    
        return dp[i][j];
    }
}