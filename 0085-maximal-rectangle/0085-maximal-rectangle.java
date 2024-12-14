import java.util.Stack;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0; // Handle empty matrix edge case
        int n = matrix.length, m = matrix[0].length;
        int[] heights = new int[m]; // Array to store heights for each column
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Update the height array
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }

            // Calculate the maximum area for the current row's histogram without a helper method
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j <= m; j++) {
                int currentHeight = (j == m ? 0 : heights[j]);
                while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                    int h = heights[stack.pop()];
                    int w = stack.isEmpty() ? j : j - stack.peek() - 1;
                    maxArea = Math.max(maxArea, h * w);
                }
                stack.push(j);
            }
        }

        return maxArea;
    }
}
