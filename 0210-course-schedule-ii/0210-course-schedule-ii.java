import java.util.*;

class Solution {
    public int[] findOrder(int n, int[][] p) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] in = new int[n], ans = new int[n];
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] a : p) {
            adj.get(a[1]).add(a[0]);
            in[a[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) if (in[i] == 0) q.add(i);
        int c = 0;
        while (!q.isEmpty()) {
            int x = q.poll();
            ans[c++] = x;
            for (int y : adj.get(x)) if (--in[y] == 0) q.add(y);
        }
        return c == n ? ans : new int[0];
    }
}
