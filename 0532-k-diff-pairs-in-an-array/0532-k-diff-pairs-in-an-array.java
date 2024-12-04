import java.util.Arrays;

public class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Arrays.sort(nums);
        int i = 0, j = 1, count = 0;

        while (j < nums.length) {
            int diff = nums[j] - nums[i];
            if (i == j || diff < k) {
                j++;
            } else if (diff > k) {
                i++;
            } else {
                count++;
                i++;
                j++;
                while (i < nums.length && nums[i] == nums[i - 1]) i++;
                while (j < nums.length && nums[j] == nums[j - 1]) j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findPairs(new int[]{3, 1, 4, 1, 5}, 2)); // Output: 2
        System.out.println(solution.findPairs(new int[]{1, 2, 3, 4, 5}, 1)); // Output: 4
        System.out.println(solution.findPairs(new int[]{1, 3, 1, 5, 4}, 0)); // Output: 1
    }
}
