class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] board1D = convertTo1D(board, n); 
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 0}); 
        boolean[] visited = new boolean[n * n + 1];
        visited[1] = true;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int pos = curr[0], moves = curr[1];
            if (pos == n * n) return moves; 
            for (int i = 1; i <= 6; i++) { 
                int nextPos = pos + i;
                if (nextPos > n * n) break; 
                if (board1D[nextPos] != -1) {
                    nextPos = board1D[nextPos];
                }
                if (!visited[nextPos]) {
                    visited[nextPos] = true;
                    q.add(new int[]{nextPos, moves + 1});
                }
            }
        }
        return -1; 
    }
    private int[] convertTo1D(int[][] board, int n) {
        int[] arr = new int[n * n + 1]; 
        int idx = 1;
        boolean leftToRight = true;
        for (int row = n - 1; row >= 0; row--) {
            if (leftToRight) {
                for (int col = 0; col < n; col++) {
                    arr[idx++] = board[row][col];
                }
            } else {
                for (int col = n - 1; col >= 0; col--) {
                    arr[idx++] = board[row][col];
                }
            }
            leftToRight = !leftToRight;
        }
        return arr;
    }
}
