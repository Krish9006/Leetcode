class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int minlength=Integer.MAX_VALUE;
      int sum=0;
      int j=0;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        while(sum>=target){
            minlength=Math.min(minlength,i-j+1);
            sum-=nums[j];
            j++;
        }
      } 
       return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }
}