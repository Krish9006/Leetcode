class Solution {
    public boolean isPossibleToSplit(int[] nums) {
       int frq[]=new int[101];
       for(int i=0;i<nums.length;i++){
        frq[nums[i]]++;
        }
        for(int i=0;i<=100;i++){
            if(frq[i]>2){
                return false;
            }
        }
        return true;
    }
}