class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> diagonals = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                diagonals.putIfAbsent(key, new ArrayList<>());
                diagonals.get(key).add(grid[i][j]);
            }
        }
        for (int key : diagonals.keySet()) {
            List<Integer> list = diagonals.get(key);
            if (key >= 0) {
                list.sort(Collections.reverseOrder()); 
            } else {
                Collections.sort(list); 
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                grid[i][j] = diagonals.get(key).remove(0);
            }
        }

        return grid;
    }
}
