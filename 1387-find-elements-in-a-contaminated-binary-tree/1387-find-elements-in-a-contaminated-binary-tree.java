class FindElements {
    private TreeNode root;
    public FindElements(TreeNode root) {
        this.root = root;
        recover(root, 0);
    }
    private void recover(TreeNode node, int x) {
        if (node == null) return;
        node.val = x;
        recover(node.left, 2 * x + 1);
        recover(node.right, 2 * x + 2);
    }
    public boolean find(int target) {
        return findHelper(root, target);
    }
    private boolean findHelper(TreeNode node, int target) {
        if (node == null) return false;
        if (node.val == target) return true;
        return findHelper(node.left, target) || findHelper(node.right, target);
    }
}