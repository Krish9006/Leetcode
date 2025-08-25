class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] ans = new int[m * n];
        int r = 0, c = 0, k = 0;
        boolean up = true; // direction: true = up-right, false = down-left

        while (k < m * n) {
            ans[k++] = mat[r][c];

            if (up) { // going up-right
                if (c == n - 1) { r++; up = false; }   // right edge
                else if (r == 0) { c++; up = false; }  // top edge
                else { r--; c++; } // normal move
            } else { // going down-left
                if (r == m - 1) { c++; up = true; }    // bottom edge
                else if (c == 0) { r++; up = true; }   // left edge
                else { r++; c--; } // normal move
            }
        }
        return ans;
    }
}
