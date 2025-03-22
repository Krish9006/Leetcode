class Solution {
    public int countNegatives(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int c=0;
        for(int i=0;i<row;i++){
            int l=0,h=col-1;
            while(l<=h){
                int m=l+(h-l)/2;
                if(grid[i][m]<0){
                    h=m-1;
                }

                else {
                    l=m+1;
                }
            }
                c+=(col-l); 
        }
        return c;
        
    }
}