class Solution:
    def minimum_absolute_sum_difference(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_absolute_sum_difference(root.left), self.minimum_absolute_sum_difference(root.right))