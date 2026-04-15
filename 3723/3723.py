class Solution:
    def maximize_sum_of_squares_of_digits(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximize_sum_of_squares_of_digits(root.left), self.maximize_sum_of_squares_of_digits(root.right))