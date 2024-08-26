class Solution {
    public void setZeroes(int[][] arr) {
        int[] row = new int[200];
        int[] col = new int[200];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[count]=i;
                    col[count]=j;
                    count++;
                }
            }
        }
        for(int i=0;i<count;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[row[i]][j]=0;
            }
        }
        for(int i=0;i<count;i++){
            for(int j=0;j<arr.length;j++){
                arr[j][col[i]]=0;
            }
        }
        
    }
}