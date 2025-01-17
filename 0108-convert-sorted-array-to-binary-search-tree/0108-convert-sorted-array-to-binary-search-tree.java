class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Start with the full range of the array
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        // Base case: if start > end, no more elements to process
        if (start > end) {
            return null;
        }

        // Find the middle element
        int mid = start + (end - start) / 2;

        // Create a node with the middle element
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively build the left and right subtrees
        root.left = sortedArrayToBST(nums, start, mid - 1); // Left half
        root.right = sortedArrayToBST(nums, mid + 1, end);  // Right half

        return root;
    }
}
