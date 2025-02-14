class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false; 
        int target = sum / 2;
        boolean[][] dp = new boolean[nums.length + 1][target + 1];
        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= target; j++) {
                dp[i][j] = dp[i - 1][j]; 
                if (nums[i - 1] <= j) {
                    dp[i][j] |= dp[i - 1][j - nums[i - 1]]; 
                }
            }
        }
        return dp[nums.length][target];
    }
}
