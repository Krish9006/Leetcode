class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        int b=0;
        for(int i=1;i<nums.length;i++){
            a=nums[i]-nums[i-1];
            b=Math.max(a,b);
           

        }
        return b;
        
    }
}