class Solution:
    def minimum_bitwise_or_from_grid(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_bitwise_or_from_grid(root.left), self.minimum_bitwise_or_from_grid(root.right))