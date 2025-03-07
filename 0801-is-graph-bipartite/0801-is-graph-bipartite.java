import java.util.*;

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1); 
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) { 
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                color[i] = 0; 
                while (!q.isEmpty()) { 
                    int node = q.poll();
                    for (int neighbour : graph[node]) { 
                        if (color[neighbour] == -1) { 
                            color[neighbour] = 1 - color[node]; 
                              q.add(neighbour);
                        } else if (color[neighbour] == color[node]) { 
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
