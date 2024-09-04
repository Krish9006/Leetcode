class Solution {
    public int minFlips(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int rowFlips = 0;
        int columnFlips = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (grid[i][j] != grid[i][n - j - 1]) {
                    rowFlips++;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m / 2; i++) {
                if (grid[i][j] != grid[m - i - 1][j]) {
                    columnFlips++;
                }
            }
        }

        return Math.min(rowFlips, columnFlips);
    }
}
