class Solution:
    def sum_of_square_numbers(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.sum_of_square_numbers(root.left), self.sum_of_square_numbers(root.right))