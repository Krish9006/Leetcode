class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        int maxLen = 1, totalWays = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j]; // Reset count
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j]; // Add ways
                    }
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        // Count all LIS with maxLen
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxLen) {
                totalWays += count[i];
            }
        }

        return totalWays;
    }
}
