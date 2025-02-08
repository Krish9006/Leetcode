class Solution {
    public int uniquePaths(int m, int n) {
        int[][]dp= new int[n][m];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
            return solve(n-1,m-1,dp);
        }
       private int solve(int i,int j,int [][]dp){
            if(i<0||j<0)return 0;
            if(i==0&&j==0)return 1;
            if(dp[i][j]!=-1)return dp[i][j];
            dp[i][j]=solve(i-1,j,dp)+solve(i,j-1,dp);
              return dp[i][j];
      
        
    }
}