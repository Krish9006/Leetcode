import java.util.Arrays;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            result[i] = findIndex(sorted, nums[i]);
        }
        
        return result;
    }

    private int findIndex(int[] sorted, int target) {
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] == target) {
                return i;
            }
        }
        return 0;
    }
}
