class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        Integer[][]dp = new Integer[n][n];
        return slove(nums,0,n-1,dp)>=0;
    }
    public int slove(int []nums,int i,int j,Integer[][]dp){
       if (i == j) return nums[i];
        if (dp[i][j] != null) return dp[i][j];
        int start=nums[i]-slove(nums,i+1,j,dp);
         int end = nums[j] - slove(nums, i, j-1, dp);
        dp[i][j]= Math.max(start,end);
        return dp[i][j];
    }
}