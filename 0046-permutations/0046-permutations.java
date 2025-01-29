import java.util.*;

class Solution {
    public void backtrack(List<List<Integer>> res, int[] nums, List<Integer> prem) {
        if (prem.size() == nums.length) {
            res.add(new ArrayList<>(prem));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (prem.contains(nums[i])) continue; // Prevent duplicates in permutation
            prem.add(nums[i]);
            backtrack(res, nums, prem);
            prem.remove(prem.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, nums, new ArrayList<>());
        return res;
    }
}
