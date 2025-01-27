class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> hp=new HashSet<>();
        for(int num:nums){
            if(num>0){
                hp.add(num);
            }
        }
        return hp.size();
        
    }
}