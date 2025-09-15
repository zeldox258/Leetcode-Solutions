class Solution:
    def leftmost_column_with_at_least_a_one(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.leftmost_column_with_at_least_a_one(root.left), self.leftmost_column_with_at_least_a_one(root.right))