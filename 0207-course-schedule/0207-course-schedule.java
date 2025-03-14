import java.util.*;

class Solution {
    static boolean ans = true; // Initialize ans properly
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
        }

        boolean[] visited = new boolean[n];
        boolean[] path = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (isCyclic(i, adj, visited, path)) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isCyclic(int course, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] path) {
        visited[course] = true;
        path[course] = true;
        for (int ele : adj.get(course)) {
            if (path[ele]) {
                return true; 
            }
            if (!visited[ele]) {
                if (isCyclic(ele, adj, visited, path)) {
                    return true;
                }
            }
        }
        path[course] = false;
        return false;
    }
}
