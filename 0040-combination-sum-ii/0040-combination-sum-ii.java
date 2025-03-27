
class Solution {
    public void solve(int[] candidates, int i, List<Integer> curr, List<List<Integer>> res, int target) {
        if (target == 0) { 
            res.add(new ArrayList<>(curr)); 
            return; 
        }
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) continue; 
            if (candidates[j] > target) break; 

            curr.add(candidates[j]);
            solve(candidates, j + 1, curr, res, target - candidates[j]);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, 0, new ArrayList<>(), res, target);
        return res;
    }
}
