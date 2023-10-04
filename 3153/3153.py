class Solution:
    def sum_of_digit_differences_of_all_pairs(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.sum_of_digit_differences_of_all_pairs(root.left), self.sum_of_digit_differences_of_all_pairs(root.right))