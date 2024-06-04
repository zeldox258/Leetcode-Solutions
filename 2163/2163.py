class Solution:
    def minimum_difference_in_sums_after_removal(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_difference_in_sums_after_removal(root.left), self.minimum_difference_in_sums_after_removal(root.right))