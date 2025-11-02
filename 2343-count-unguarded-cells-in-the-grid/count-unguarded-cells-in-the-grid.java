public class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        for (int[] w : walls) grid[w[0]][w[1]] = 1; // wall
        for (int[] g : guards) grid[g[0]][g[1]] = 2; // guard

        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}}; 
        for (int[] g : guards) {
            for (int[] dir : directions) {
                for (int r = g[0] + dir[0], c = g[1] + dir[1];
                     r >= 0 && r < m && c >= 0 && c < n;
                     r += dir[0], c += dir[1]) {
                    if (grid[r][c] == 1 || grid[r][c] == 2) break;
                    grid[r][c] = 3; // mark as guarded
                }
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 0) count++;

        return count;
    }
}