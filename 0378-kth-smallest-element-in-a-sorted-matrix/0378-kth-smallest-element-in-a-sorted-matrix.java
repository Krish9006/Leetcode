import java.util.PriorityQueue;

public class Solution {
    
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{matrix[i][0], i, 0});
        }
        
        for (int i = 0; i < k - 1; i++) {
            int[] curr = pq.poll();
            int row = curr[1], col = curr[2];
            if (col + 1 < n) {
                pq.add(new int[]{matrix[row][col + 1], row, col + 1});
            }
        }
        
        return pq.poll()[0];
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] matrix1 = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k1 = 8;
        System.out.println(sol.kthSmallest(matrix1, k1));
        
        int[][] matrix2 = {
            {-5}
        };
        int k2 = 1;
        System.out.println(sol.kthSmallest(matrix2, k2));
    }
}
