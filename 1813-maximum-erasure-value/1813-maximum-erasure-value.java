class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int i=0,j=0,max=0,sum=0;
        while(i<nums.length){
            if(!set.contains(nums[i])){
            set.add(nums[i]);
            sum+=nums[i];
            max=Math.max(max,sum);
            i++;
            }
            else{
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }
        }
        return max;
    }
}