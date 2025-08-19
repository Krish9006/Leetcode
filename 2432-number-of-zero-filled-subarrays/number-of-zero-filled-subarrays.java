class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long totalcount=0;
        long count=0;
        for(int num:nums){
            if(num==0){
                count++;
            totalcount+=count;
        }
            else{
                count=0;
            }
        }
        return totalcount;
    }
}