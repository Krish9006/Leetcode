class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
        }

        int[] visited = new int[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0 && isCyclic(i, adj, visited)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCyclic(int course, ArrayList<ArrayList<Integer>> adj, int[] visited) {
        if (visited[course] == 1) return true;
        if (visited[course] == 2) return false;

        visited[course] = 1;
        for (int neighbor : adj.get(course)) {
            if (isCyclic(neighbor, adj, visited)) {
                return true;
            }
        }
        visited[course] = 2;
        return false;
    }
}
