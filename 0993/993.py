class Solution:
    def cousins_in_binary_tree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.cousins_in_binary_tree(root.left), self.cousins_in_binary_tree(root.right))