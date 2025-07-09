class Solution {
    public int[][] transpose(int[][] arr) {
        int m=arr.length,n=arr[0].length;
        int [][]transpose = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose [i][j]=arr[j][i];
            }
        }
                return  transpose;
    }
}
