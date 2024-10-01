class Solution:
    def check_if_number_has_equal_digit_count_an(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.check_if_number_has_equal_digit_count_an(root.left), self.check_if_number_has_equal_digit_count_an(root.right))