class Solution {
    public boolean dfs(int[]arr,int index,boolean[]vis){
        if(index<0||index>=arr.length||vis[index]){
            return false;
        }
        if(arr[index]==0){
            return true;
        }
        vis[index]=true;
        int next=index+arr[index];
        int prev=index-arr[index];
        return dfs(arr,next,vis)||dfs(arr,prev,vis);
    }
    public boolean canReach(int[] arr, int start) {
        boolean[]vis=new boolean[arr.length];
        return dfs(arr,start,vis);
    }
}