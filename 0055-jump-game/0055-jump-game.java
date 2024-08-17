class Solution {
    public boolean canJump(int[] nums) {
        int n= nums.length;
         int jumplength=0;
        for(int i=0;i<n;i++){
            if(i>jumplength){
                return false;
            }
             jumplength = Math.max(jumplength, i + nums[i]);
        }
        return true;
    }
}