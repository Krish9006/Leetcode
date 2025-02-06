class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];  // Only one house, directly rob it
        if (n == 2) return Math.max(nums[0], nums[1]);  // Max of two

        // Either rob from [0, n-2] or [1, n-1]
        return Math.max(robRange(nums, 0, n - 2), robRange(nums, 1, n - 1));
    }

    private int robRange(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0, curr = 0;
        for (int i = start; i <= end; i++) {
            curr = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.rob(new int[]{2,3,2})); 
        System.out.println(obj.rob(new int[]{1,2,3,1}));
        System.out.println(obj.rob(new int[]{1,2,3})); 
    }
}
