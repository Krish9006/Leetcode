class Solution {
    public int numSubmat(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp= new int[m][n];
        int total = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = (j == 0 ? 1 : dp[i][j - 1] + 1);
                    int minWidth = dp[i][j];
                    for (int k = i; k >= 0; k--) {
                        minWidth = Math.min(minWidth, dp[k][j]);
                        if (minWidth == 0) break;
                        total += minWidth;
                    }
                }
            }
        }
        return total;
    }
}
