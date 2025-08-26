class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = 0;
        int maxDiag = 0;
        for (int[] rect : dimensions) {
            int l = rect[0], w = rect[1];
            int diag = l*l + w*w;   
            int area = l*w;
            if (diag > maxDiag || (diag == maxDiag && area > ans)) {
                maxDiag = diag;
                ans = area;
            }
        }
        return ans;
    }
}
