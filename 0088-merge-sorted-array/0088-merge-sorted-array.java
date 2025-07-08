class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            arr1[i] = arr2[j];
            i++;
        }
        Arrays.sort(arr1);
    }
}
