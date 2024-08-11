class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long minValue, long maxValue) {
        if (node == null) {
            return true;
        }

        if (node.val <= minValue || node.val >= maxValue) {
            return false;
        }

        boolean leftIsValid = isValidBST(node.left, minValue, node.val);
        boolean rightIsValid = isValidBST(node.right, node.val, maxValue);

        return leftIsValid && rightIsValid;
    }
}