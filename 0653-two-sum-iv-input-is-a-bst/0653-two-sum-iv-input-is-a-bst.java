import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        List<Integer> elements = new ArrayList<>();
        inOrderTraversal(root, elements);

        for (int i = 0; i < elements.size(); i++) {
            for (int j = i + 1; j < elements.size(); j++) {
                if (elements.get(i) + elements.get(j) == k) {
                    return true;
                }
            }
        }

        return false;
    }

    private void inOrderTraversal(TreeNode node, List<Integer> elements) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, elements);
        elements.add(node.val);
        inOrderTraversal(node.right, elements);
    }
}
