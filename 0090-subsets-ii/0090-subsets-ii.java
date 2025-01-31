class Solution {
 public void solve(int[] nums, int i, List<Integer> curr, List<List<Integer>> res) {
        if(i==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        solve( nums,i+1,curr,res);
        curr.remove(curr.size()-1);
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
        solve(nums,i+1,curr,res);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  
        solve(nums, 0, new ArrayList<>(), res);
        return res;
        
    }
}