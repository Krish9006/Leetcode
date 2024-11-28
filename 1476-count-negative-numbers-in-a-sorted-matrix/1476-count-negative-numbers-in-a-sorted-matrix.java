class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int l = 0, h = m - 1;
            while (l <= h) {
                int mid = (l + h) / 2;
                if (grid[i][mid] < 0) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            count += (m - l);
        }
        return count;
    }
}
