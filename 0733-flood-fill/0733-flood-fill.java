class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startcolor=image[sr][sc];
        if(startcolor==color)return image;
        dfs(image,sr,sc,startcolor,color);
        return image;
    }
    private void dfs(int[][] image, int r, int c, int startcolor,int newcolor){
        if(r<0||r>=image.length||c<0||c>=image[0].length)return;
        if(image[r][c]!=startcolor)return;
        image[r][c]=newcolor;
        dfs(image,r+1,c,startcolor,newcolor);
        dfs(image,r-1,c,startcolor,newcolor);
        dfs(image,r,c+1,startcolor,newcolor);
        dfs(image,r,c-1,startcolor,newcolor);
}
}
    
