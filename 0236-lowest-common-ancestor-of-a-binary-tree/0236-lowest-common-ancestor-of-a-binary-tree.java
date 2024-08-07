/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean exists(TreeNode root, TreeNode target) {
        if (root == null) return false;
        if (root == target) return true;
        return exists(root.left, target) || exists(root.right, target);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        
        boolean leftP = exists(root.left, p);
        boolean leftQ = exists(root.left, q);
        
        if (leftP != leftQ) return root;
        
        TreeNode childSide = leftP ? root.left : root.right;
        return lowestCommonAncestor(childSide, p, q);
    }
}
