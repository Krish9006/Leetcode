class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        int[][] dp = new int[n + 1][m + 1]; 
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(n, m, s, p, dp) == 1;
    }
    private int helper(int i, int j, String s, String p, int[][] dp) {
        if (i == 0 && j == 0) return 1;
        if (j == 0) return 0;
        if (i == 0) {
            for (int k = 0; k < j; k++) {
                if (p.charAt(k) != '*') return 0;
            }
            return 1;
        }
        if (dp[i][j] != -1) return dp[i][j];

        if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '?') {
            return dp[i][j] = helper(i - 1, j - 1, s, p, dp);
        } else if (p.charAt(j - 1) == '*') {
            return dp[i][j] = (helper(i - 1, j, s, p, dp) == 1 || helper(i, j - 1, s, p, dp) == 1) ? 1 : 0;
        }

        return dp[i][j] = 0;
    }
}
