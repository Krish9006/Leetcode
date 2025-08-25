class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        List<Integer> ansList = new ArrayList<>();

        for (int d = 0; d < rows + cols - 1; d++) {
            List<Integer> temp = new ArrayList<>();
            int r = d < cols ? 0 : d - cols + 1;
            int c = d < cols ? d : cols - 1;

            while (r < rows && c >= 0) {
                temp.add(mat[r][c]);
                r++;
                c--;
            }

            if (d % 2 == 0)
                Collections.reverse(temp);
            ansList.addAll(temp);
        }
        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++)
            ans[i] = ansList.get(i);
        return ans;
    }
}
