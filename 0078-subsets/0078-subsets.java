class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); // Correctly initialize res to store subsets
        ArrayList<Integer> current = new ArrayList<>(); // List to store the current subset
        count(nums, 0, nums.length, 0, current, res); // Call the helper function
        return res; // Return all subsets
    }

    private void count(int[] nums, int s, int n, int i, ArrayList<Integer> current, List<List<Integer>> res) {
        // Base Case: If index reaches the end of the array, add the current subset to res
        if (i == n) {
            res.add(new ArrayList<>(current)); // Add a copy of the current subset
            return;
        }

        // Recursive Case 1: Exclude the current element
        count(nums, s, n, i + 1, current, res);

        // Recursive Case 2: Include the current element
        current.add(nums[i]); // Add the current element to the subset
        count(nums, s, n, i + 1, current, res); // Recursive call with the included element
        current.remove(current.size() - 1); // Backtrack: Remove the last added element
    }
}
