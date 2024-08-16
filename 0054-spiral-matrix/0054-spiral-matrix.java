class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        List<Integer> ans = new ArrayList<>();
        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;
        while (minr <= maxr && minc <= maxc) {
            for (int j = minc; j <= maxc; j++) {
                ans.add(arr[minr][j]);
            }
            minr++;
            for (int i = minr; i <= maxr; i++) {
                if (minc <= maxc) 
                    ans.add(arr[i][maxc]);
            }
            maxc--;
            for (int j = maxc; j >= minc; j--) {
                if (minr <= maxr) 
                    ans.add(arr[maxr][j]);
            }
            maxr--;
            for (int i = maxr; i >= minr; i--) {
                if (minc <= maxc) 
                    ans.add(arr[i][minc]);
            }
            minc++;
        }

        return ans;
    }
}