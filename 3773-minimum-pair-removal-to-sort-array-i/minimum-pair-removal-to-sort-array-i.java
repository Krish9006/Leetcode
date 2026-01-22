class Solution{
    public int minimumPairRemoval(int[] nums){
        int count=0;
        while(!isSorted(nums)){
            int min=Integer.MAX_VALUE;
            int idx=0;
            for(int i=0;i<nums.length-1;i++){
                int s=nums[i]+nums[i+1];
                if(s<min){
                    min=s;
                    idx=i;
                }
            }
            int[] t=new int[nums.length-1];
            int k=0;
            for(int i=0;i<nums.length;i++){
                if(i==idx){
                    t[k++]=nums[i]+nums[i+1];
                    i++;
                }else{
                    t[k++]=nums[i];
                }
            }
            nums=t;
            count++;
        }
        return count;
    }
    
    boolean isSorted(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]) return false;
        }
        return true;
    }
}
