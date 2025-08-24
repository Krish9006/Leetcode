class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int maxlen=0;
        int zerocount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zerocount++;
            while(zerocount>1){
                if(nums[left]==0)zerocount--;
                left++;
            }
            maxlen=Math.max(maxlen,i-left);
        }
        return maxlen;
    }
}