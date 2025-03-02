class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;  
        int m = grid[0].length;  
        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j, 0});  
                } else if (grid[i][j] == 1) {
                    freshCount++;  
                }
            }
        }
        int time = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};  
        while (!q.isEmpty()) {
            int[] cell = q.poll();  
            int i = cell[0], j = cell[1], t = cell[2];  
            time = Math.max(time, t); 
            for (int[] d : directions) {
                int ni = i + d[0], nj = j + d[1];  
                if (ni >= 0 && nj >= 0 && ni < n && nj < m && grid[ni][nj] == 1) {
                    grid[ni][nj] = 2; 
                    q.add(new int[]{ni, nj, t + 1});  
                    freshCount--;  
                }
            }
        }
        return (freshCount == 0) ? time : -1;
    }
}
