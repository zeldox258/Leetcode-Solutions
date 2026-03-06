class Solution:
    def max_sum_of_rectangle_no_larger_than_k(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.max_sum_of_rectangle_no_larger_than_k(root.left), self.max_sum_of_rectangle_no_larger_than_k(root.right))