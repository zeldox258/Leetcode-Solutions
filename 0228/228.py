class Solution:
    def summary_ranges(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.summary_ranges(root.left), self.summary_ranges(root.right))