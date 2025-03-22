class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int maxlen=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+= (nums[i]==0)?-1:1;
            if(sum==0){
                maxlen=i+1;
            }
            if(hm.containsKey(sum)) {
                maxlen=Math.max(maxlen,i-hm.get(sum));
            }
            else{
                hm.put(sum,i);
            }
        }
        return maxlen;
    }
}