# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.dia = 0
        
        def h(node):
            if node is None:
                return 0
            left_height = h(node.left)
            right_height = h(node.right)
            self.dia = max(self.dia, left_height + right_height)
            return max(left_height, right_height) + 1
        
        h(root)
        return self.dia
