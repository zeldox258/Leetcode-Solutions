class Solution:
    def diameter_of_binary_tree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.diameter_of_binary_tree(root.left), self.diameter_of_binary_tree(root.right))