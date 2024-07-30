import java.util.Arrays;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] nextGreater = new int[m];
        Arrays.fill(nextGreater, -1);
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (nums2[j] > nums2[i]) {
                    nextGreater[i] = nums2[j];
                    break;
                }
            }
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = nextGreater[j];
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result));  
    }
}
