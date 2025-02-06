class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];  // Only one house to rob
        if (n == 2) return Math.max(nums[0], nums[1]);  // Choose the max of two

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(obj.rob(nums));  
    }
}
