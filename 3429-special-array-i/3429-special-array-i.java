class Solution {
    public boolean isArraySpecial(int[] nums) {
       for(int i=0;i<nums.length;i++){
 if (i == nums.length - 1 || nums[i] % 2 != nums[i + 1] % 2) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
       