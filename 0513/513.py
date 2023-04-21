class Solution:
    def find_bottom_left_tree_value(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_bottom_left_tree_value(root.left), self.find_bottom_left_tree_value(root.right))