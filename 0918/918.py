class Solution:
    def maximum_sum_circular_subarray(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_sum_circular_subarray(root.left), self.maximum_sum_circular_subarray(root.right))