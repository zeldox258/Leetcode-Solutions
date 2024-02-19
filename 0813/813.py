class Solution:
    def largest_sum_of_averages(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.largest_sum_of_averages(root.left), self.largest_sum_of_averages(root.right))