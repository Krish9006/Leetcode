class Solution {
    public int missingNumber(int[] nums) {
     int n= nums.length;
     for(int i=0;i<n;i++){
        while(nums[i]<n && nums[i]!=nums[nums[i]]){
            int temp= nums[i];
            nums[i]=nums[temp];
            nums[temp]=temp;
        }
     }  
     for(int i=0;i<n;i++){
        if(nums[i]!=i){
            return i;
        }
     } 
     return n;
    }
}