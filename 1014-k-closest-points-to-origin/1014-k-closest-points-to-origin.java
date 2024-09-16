import java.util.*;

class Triplet {
    public final int distanceSquared;
    public final int x;
    public final int y;

    public Triplet(int distanceSquared, int x, int y) {
        this.distanceSquared = distanceSquared;
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.distanceSquared, a.distanceSquared));

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int distanceSquared = x * x + y * y;
            Triplet triplet = new Triplet(distanceSquared, x, y);
            maxHeap.offer(triplet);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            Triplet triplet = maxHeap.poll();
            result[i][0] = triplet.x;
            result[i][1] = triplet.y;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] points = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 2;

        int[][] closestPoints = solution.kClosest(points, k);

        for (int[] point : closestPoints) {
            System.out.println(Arrays.toString(point));
        }
    }
}
