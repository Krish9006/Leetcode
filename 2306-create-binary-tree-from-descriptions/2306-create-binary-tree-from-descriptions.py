class Solution:
    def createBinaryTree(self, descriptions):
        node_map = {}
        children = set()
        
        for parent, child, is_left in descriptions:
            if parent not in node_map:
                node_map[parent] = TreeNode(parent)
            if child not in node_map:
                node_map[child] = TreeNode(child)
                
            if is_left:
                node_map[parent].left = node_map[child]
            else:
                node_map[parent].right = node_map[child]
            
            children.add(child)
        
        root_val = None
        for parent, _, _ in descriptions:
            if parent not in children:
                root_val = parent
                break
        
        return node_map.get(root_val, None)