class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int n = original.length;
        long minStart = bounds[0][0];
        long maxStart = bounds[0][1];
        long[] diff = new long[n];
        diff[0] = 0;
        for (int i = 1; i < n; i++) {
            diff[i] = diff[i-1] + ((long)original[i] - original[i-1]);
        }
        for (int i = 0; i < n; i++) {
            long minRequired = (long)bounds[i][0] - diff[i];
            long maxPossible = (long)bounds[i][1] - diff[i];
            minStart = Math.max(minStart, minRequired);
            maxStart = Math.min(maxStart, maxPossible);
            if (minStart > maxStart) {
                return 0;
            }
        }
        if (maxStart - minStart + 1 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)(maxStart - minStart + 1);
    }
}