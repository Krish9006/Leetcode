class Solution {
    public int fib(int n) {
        int []dp= new int[n+1];
        Arrays.fill(dp,-1);
        return slove(n,dp);
        
    }
    private int slove(int i,int[]dp){
        if(i<=1)return i;
        if(dp[i]!=-1)return dp[i];
        dp[i]=slove(i-1,dp)+slove(i-2,dp);
        return dp[i];
    }
}