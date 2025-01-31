class Solution {
    public void solve(int[] candidates, int i, List<Integer> curr, List<List<Integer>> res, int target, int sum) {
        if (sum > target) return;
        if (sum == target) { 
            res.add(new ArrayList<>(curr)); 
            return; 
        }
        if (i == candidates.length) return;

        curr.add(candidates[i]);
        solve(candidates, i, curr, res, target, sum + candidates[i]);
        curr.remove(curr.size() - 1);

        solve(candidates, i + 1, curr, res, target, sum);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>(); 
        solve(candidates, 0, new ArrayList<>(), res, target, 0);
        return res;
    }
}
