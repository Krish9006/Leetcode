class Solution {
    public boolean exists(TreeNode root, TreeNode target) {
        if (root == null)
            return false;
        if (root == target)
            return true;
        return exists(root.left, target) || exists(root.right, target);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;

        boolean leftP = exists(root.left, p);
        boolean leftQ = exists(root.left, q);

        if (leftP == true && leftQ == true) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (leftP == false && leftQ == false) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}