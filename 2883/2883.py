class Solution:
    def drop_missing_data(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.drop_missing_data(root.left), self.drop_missing_data(root.right))