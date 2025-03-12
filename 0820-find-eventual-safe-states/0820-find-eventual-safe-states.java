import java.util.*;

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[n];  
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int ele : graph[i]) {
                adj.get(ele).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) q.add(i);
        }
        while (!q.isEmpty()) {
            int front = q.poll();
            ans.add(front);
            for (int a : adj.get(front)) {
                indegree[a]--; 
                if (indegree[a] == 0) q.add(a);
            }
        }
        Collections.sort(ans);  
        return ans;
    }
}
