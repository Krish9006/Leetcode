class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
        int m=colSum.length;
        int [][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int minSum=Math.min(rowSum[i],colSum[j]);
                matrix[i][j]=minSum;
                rowSum[i] -= minSum;
                colSum[j] -= minSum;
            }
        }
        return matrix;
    }
}
               
    