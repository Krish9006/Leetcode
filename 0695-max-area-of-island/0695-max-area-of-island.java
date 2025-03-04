class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxarea=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(grid[i][j]==1){
              int area=dfs(grid,i,j);
              maxarea=Math.max(maxarea,area);
            }
        }
        }
         
        return maxarea;
        }
        private int dfs(int[][]grid,int i,int j){
            if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0)return 0;
            grid[i][j]=0;
            int c=1;
            c+=dfs(grid,i+1,j);
            c+=dfs(grid,i-1,j);
            c+=dfs(grid,i,j+1);
            c+=dfs(grid,i,j-1);  
            return c;  
    }
}