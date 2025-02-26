class Solution {
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int count=0;
        boolean[]visit=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visit[i]){
                bfs(i,visit,adj);
                count++;
            }
        }
        return count;
    }
    private void bfs(int i,boolean[]visit,int[][]adj){
        int n=adj.length;
        visit[i]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int top=q.remove();
            for(int j=0;j<n;j++){
                if(adj[top][j]==1&&!visit[j]){
                    q.add(j);
                    visit[j]=true;
                }
            }
        }
    }
}