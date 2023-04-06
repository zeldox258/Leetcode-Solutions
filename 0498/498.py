class Solution:
    def diagonal_traverse(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.diagonal_traverse(root.left), self.diagonal_traverse(root.right))