import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int d = x * x + y * y;
            pq.add(new Triplet(d, x, y));
            
            if (pq.size() > k) {
                pq.remove();
            }
        }
        
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            Triplet t = pq.poll();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        
        return ans;
    }
}

class Triplet implements Comparable<Triplet> {
    int dist;
    int x;
    int y;
    
    Triplet(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int compareTo(Triplet other) {
        return Integer.compare(this.dist, other.dist);
    }
}
