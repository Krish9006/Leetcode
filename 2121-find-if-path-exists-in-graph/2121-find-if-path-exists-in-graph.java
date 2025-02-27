class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[]adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);

        }
        boolean []visited=new boolean[n];
        return dfs(adj,source,destination,visited);
    }
   private boolean dfs(List<Integer>[] adj, int node, int destination, boolean[] visited) {
    if(node==destination)return true;
    visited[node]=true;
     for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                if (dfs(adj, neighbor, destination, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}