class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return slove(n, m, s, p, dp) == 1;
 }
     private int slove(int i, int j, String s, String p, int[][] dp) {
        if (i == 0 && j == 0) {
            return 1;
        }
        if (j == 0) {
            return 0;
        }
        if (i == 0) {
            while (j > 0) {
                if (p.charAt(j - 1) != '*') {
                    return 0;
                }
                j -= 2;
            }
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (p.charAt(j - 1) == '*') {
            if (slove(i, j - 2, s, p, dp) == 1) {
                dp[i][j] = 1;
                return 1;
            }
            if (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') {
                if (slove(i - 1, j, s, p, dp) == 1) {
                    dp[i][j] = 1;
                    return 1;
                }
            }
        } else if (p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1)) {
            if (slove(i - 1, j - 1, s, p, dp) == 1) {
                dp[i][j] = 1;
                return 1;
            }
        }
        dp[i][j] = 0;
        return 0;
    }
}